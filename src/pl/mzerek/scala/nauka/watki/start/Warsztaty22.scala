package pl.mzerek.scala.nauka.watki.start

import java.util.concurrent.Executors
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit

object Warsztaty22 {
  def main(args: Array[String]): Unit = {
    val e=Executors.newFixedThreadPool(3)
    
    (1 to 10).foreach{i=>
      e.submit(new Task())  
    }
    //e.shutdown()
    e.awaitTermination(1, TimeUnit.SECONDS)
  }
  
  class Task extends Callable[Int]{
    def call() = {
      println(s"jestem w watku ${Thread.currentThread().getName}")
      69
    }
  }
}