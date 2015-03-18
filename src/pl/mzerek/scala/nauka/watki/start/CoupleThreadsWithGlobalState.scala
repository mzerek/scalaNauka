package pl.mzerek.scala.nauka.watki.start

object CoupleThreadsWithGlobalState {
  
  private var global=0
  
  def main(args: Array[String]) {
    
    val workers = Seq.fill(100)(new Worker())
    
    workers.foreach(_.start())
    workers.foreach(_.join())
    
    println(s"global na końscu ${global}")
    
  }
  
  
  class Worker extends Thread{
    override def run=global=global+1
  }

}