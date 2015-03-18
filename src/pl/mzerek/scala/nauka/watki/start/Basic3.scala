package pl.mzerek.scala.nauka.watki.start

object Basic3 {
  def main(args: Array[String]): Unit = {
    //Strumienie
    
    val res = (1 to 100)
    .map(_*2)
    .par
    .map(_*2)
    .map(e=>{println(s"Watek : ${Thread.currentThread().getName}");e})
    .sum
    
    println(res)
    
  }
}