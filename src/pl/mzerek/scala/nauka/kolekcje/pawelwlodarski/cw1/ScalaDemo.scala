package pl.mzerek.scala.nauka.pawelwlodarski.cw1

object ScalaDemo {

  def main(args: Array[String]) {

    val lista = List(1, 2, 3, 4, 5)
   // lista.filter(element => element > 2)
    
    println(lista.filter(element => element > 2))
    
    
    val lista2 = List("a", "b", "c", "d", "e")
    //lista2.filter(dupa => dupa > "c")
    
    println(lista2.filter(dupa => dupa > "c"))
    
  }

}