package pl.mzerek.scala.nauka.watki.start

import java.util.concurrent.BlockingDeque
import java.util.concurrent.LinkedBlockingQueue
import scala.annotation.tailrec
import java.util.concurrent.BlockingQueue
import java.util.concurrent.TimeUnit
import java.util.Random

object Basic4 {
  def main(args: Array[String]): Unit = {
    val q: BlockingQueue[Int] = new LinkedBlockingQueue(3)

    val p1 = new Thread(new Producer(q))

    val c = new Thread(new Consumer(q))

    val p2 = new Thread(new Producer(q))

    p1.start()
    c.start()
    p2.start()
  }

  class Producer(q: BlockingQueue[Int]) extends Runnable {

    private val data = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9).iterator

    @tailrec
    final def run(): Unit = {
      val v = data.next()
      println(s"adding $v: q : ${q}")
      q.put(v)
      TimeUnit.SECONDS.sleep(3)
      if (data.hasNext) run()
    }

    //private val r = new Random()

    //    @tailrec  //3
    //    final def run(): Unit = {
    //      val v = r.nextInt(10)
    //      q.put(v)       //2
    //      println(s"producing ${v} :  queue size ${q.size}")
    //      TimeUnit.SECONDS.sleep()
    //      run() //3
    //    }
  }

  class Consumer(q: BlockingQueue[Int]) extends Runnable {
     @tailrec
     final def run(): Unit = {
      val v = q.take()
      println(s"recieved q :  ${q}")
      TimeUnit.SECONDS.sleep(2)
      run()

      //      while (true) {
      //        val v = q.take() //2
      //        println(s"consumed ${v} :  queue size ${q.size}")
      //        TimeUnit.SECONDS.sleep(2)
      //      }
    }
  }
}