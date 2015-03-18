package pl.mzerek.scala.nauka.watki.start

import java.util.concurrent.Callable
import java.util.concurrent.Executors

object Basic2 {
  
  
  def main(args:Array[String]){
    
    @volatile var b = true
    
    val t = new Thread{
      override def run = {
        while(b){
          println("test")
        }
      }
      
    }
    
    b=false
    
  }  

  
}