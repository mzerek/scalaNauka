package pl.mzerek.scala.nauka.pawelwlodarski.cw4

import List._

object ScalaDemo4 {

  def main(args: Array[String]) {

    var lista = List(1, 1, 2, 1, 3, 1, 4, 5)
    println(lista)

    val lista2 = lista.takeWhile(_ == 1)
    println(lista2)

    val lista3 = lista.dropWhile(_ == 1)
    println(lista3)

    println(" ")
    println(" ")
    println("=====do cwiczenia 4======")
    println(" ")
    println(" ")

    var lista4 = range(0, 101).sortWith((e1, e2) => e1 % 10 > e2 % 10).takeWhile(_<90)
    println("lista4: " + lista4)
    
    var lista5 = range(0, 101) sortWith( _ % 10 > _ % 10) takeWhile(_ <90)
    println("lista5: " + lista5)

  }

}