package pl.mzerek.scala.nauka.watki.start

import java.util.concurrent.Callable
import java.util.concurrent.Executors

object Basic {
  
  
  def main(args:Array[String]){
    
    val n=100
    val v=Vector.tabulate(n)(i=>i*2)
    val e = Executors.newFixedThreadPool(4)
    
    val done=(0 to 10).map{i=>
      e.submit(new Worker(i*10,v)) 
    
    }
    
    val result = done.map(f=>f.get)
    
    println(result.sum)
    
    e.shutdown()   
  }  
  
  class Worker(startIndex:Int, v:Vector[Int]) extends Callable[Int]{
     def call() :Int = {
       v.slice(startIndex, startIndex+10).sum
     }
  }
  
}