package pl.mzerek.scala.nauka.watki.start

object CoupleThreadsWithGlobalStateByLocks {
  private var global = 0
  private val monitor = new Object() //1 pokazać przykład ze złym monitorem

  def main(args: Array[String]) {
    val workers = Seq.fill(100)(new Worker())
    workers.foreach(_.start)
    workers.foreach(_.join)

    println(s"global na końcu ${global}")
  }

  class Worker extends Thread {
    override def run = monitor.synchronized { //1
      global = global + 1
    }
  }
}