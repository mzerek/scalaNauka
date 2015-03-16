package pl.mzerek.scala.nauka.pawelwlodarski.cw6and7

object ScalaDemo6And7 {

  def main(args: Array[String]) {

    var v = Vector(1, 2, 3, 4, 5)
    println(v)
    var r1 = v.reduce(_ + _)
    println("reduce r1: " + r1)

    val addf = (a: Int, b: Int) => a + b
    var r2 = v.reduce(addf)
    println("reduce function r2: " + r2)

    var r3 = v.foldLeft(0)(addf)
    println("foldLeft r3: " + r3)

    println("======================")
    //roznica metody i funkcji

    def toString[A](a: A, b: A) = a + ":" + b

    var m1 = Vector(1, 2, 3).reduce(toString)
    println("m1: " + m1)

    var m2 = Vector(1.0, 2.0, 3.0).reduce(toString)
    println("m2: " + m2)

    var m3 = Vector("1", "2", "3").reduce(toString)
    println("m3: " + m3)

    println("========cwiczenie 6==============")

    val addf2 = (a: Int, b: Int) => a + 2 * b

    var v2 = Vector(1, 2, 3, 4, 5)
    var f1 = v2.foldLeft(0)(addf2)
    println("foldLeft f1: " + f1)

    println("========cwiczenie 7==============")
    
  
    def genericExample[A](e: List[A]) = e.flatMap(e=>List(e,e))

    var lista = List("x", 2, 3)
    println("lista: " + genericExample(lista))

    var lista2 = List("a", 1, "c")
    println("lista2: " + genericExample(lista2))

  }

}