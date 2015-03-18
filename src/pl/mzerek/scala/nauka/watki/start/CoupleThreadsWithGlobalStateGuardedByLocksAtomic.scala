package pl.mzerek.scala.nauka.watki.start

import scala.actors.threadpool.AtomicInteger

object CoupleThreadsWithGlobalStateGuardedByLocksAtomic {
  
  private val global = new AtomicInteger(0)

  def main(args: Array[String]) {
    val workers = Seq.fill(100)(new Worker())
    workers.foreach(_.start)
    workers.foreach(_.join)

    println(s"global na końcu ${global}")
  }

  class Worker extends Thread {
    override def run = global.incrementAndGet()
  }
}