package pl.mzerek.scala.venkat.sensibleTyping

import java.util._

class Test {
  var list2 = new ArrayList[Int]

  list2 add 1
  list2 add 2

  var total = 0

  val index = 0
  for (index <- 0 until list2.size()) {
    total += list2.get(index)
  }

  println(total)
}