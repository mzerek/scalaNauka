package pl.mzerek.scala.nauka.watki.start

object SingleThreadExample {
  
  def main(args: Array[String]){
    
    val r = new Thread(new MyRunnable("Interfejs"))
    val t = new MyThread("Klasa")
    
    r.start()
    t.start()
    
    r.join()
    t.join()
    
    
  }
  
  class MyRunnable(m:String) extends Runnable {
    
    def run = println(s"Jestem w runnable : ${m}")
    
  }
  
  
  class MyThread(m:String) extends Thread {
    
    override def run = println(s"Jestem w MyThread: ${m}")
    
  }
  

}