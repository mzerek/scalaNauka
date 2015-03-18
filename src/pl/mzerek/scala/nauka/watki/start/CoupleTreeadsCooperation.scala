package pl.mzerek.scala.nauka.watki.start

object CoupleTreeadsCooperation {
  
  
  def main(args:Array[String]){
    
    val n=100
    val v=Vector.tabulate(n)(i=>i*2)
    
    val runnables=(0 to n/10).map(i=>new Summarizer(i*10, v))
    val threads=runnables.map(new Thread(_))
    
    threads.foreach(_.start())
    threads.foreach(_.join())
    
    val sum = runnables.map(_._result).sum
    println(sum)
    
    
    
  }

  
  
  
  
  class Summarizer(startIndex:Int,v:Vector[Int]) extends Runnable{
    
    var _result:Int=0;
    
    def run(): Unit = {
      val dataForThread = v.slice(startIndex, startIndex+10)
      
      println(s"summarizing elements ${startIndex} : ${startIndex+10} - ${Thread.currentThread().getName}") 
      
      
      _result=dataForThread.sum
    
    }
    
  }
  
}