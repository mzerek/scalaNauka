package pl.mzerek.scala.nauka.watki.start

import scala.actors.threadpool.AtomicInteger


object CoupleThreadsWithGlobalState {

  private var global = new AtomicInteger(0)
  private val monitor = new Object()

  def main(args: Array[String]) {

    val workers = Seq.fill(100)(new Worker())

    workers.foreach(_.start())
    workers.foreach(_.join())

    println(s"global na końscu ${global}")

  }

  class Worker extends Thread {
    override def run =  (1 to 10).foreach{_=>global.getAndIncrement}
    
  }

}