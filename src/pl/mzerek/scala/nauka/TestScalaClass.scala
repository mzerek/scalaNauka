package pl.mzerek.scala.nauka

object TestScalaClass {
  def main(args: Array[String]) {

    for (i <- 1 to 3) {
      print(i + ",")
    }
    println("Scala Rocks!!!")

    //==============================

    (1 to 3).foreach(i => print(i + ","))
    println("Scala Rocks!!!")

    val c1 = new ScalaInt()

    c1.playWithInt()

  }

}

class ScalaInt {
  def playWithInt() {
    val capacity: Int = 10
    val list = new java.util.ArrayList[Int]
    list.ensureCapacity(capacity)
    
    
//     for(x <- list){
//       println(x);
//     }

  }
}