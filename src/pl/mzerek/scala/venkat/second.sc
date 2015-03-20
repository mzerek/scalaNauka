package pl.mzerek.scala.venkat

object second {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val list1 = new java.util.ArrayList[Int];       //> list1  : java.util.ArrayList[Int] = []

  {
    println("Create list1")                       //> Create list1
  }

  val list2 = new java.util.ArrayList[Int] {
    println("Create list2")
  }                                               //> Create list2
                                                  //| list2  : java.util.ArrayList[Int] = []

  println(list1.getClass())                       //> class java.util.ArrayList
  println(list2.getClass())                       //> class pl.mzerek.scala.venkat.second$$anonfun$main$1$$anon$1

  def check1() = true                             //> check1: ()Boolean
  def check2(): Boolean = return true             //> check2: ()Boolean
  println(check1)                                 //> true
  println(check2)                                 //> true

}