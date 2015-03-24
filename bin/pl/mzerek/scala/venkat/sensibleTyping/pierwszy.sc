package pl.mzerek.scala.venkat.sensibleTyping

object pierwszy {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  import java.util._

    var list2 = new ArrayList[Int]                //> list2  : java.util.ArrayList[Int] = []

  list2 add 1                                     //> res0: Boolean = true
  list2 add 2                                     //> res1: Boolean = true
 
  var total = 0                                   //> total  : Int = 0
  
  for (index <- 0 until list2.size()) {
    total += list2.get(index)
  }

  println(total)                                  //> 3

}