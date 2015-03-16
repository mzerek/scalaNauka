package pl.mzerek.scala.nauka.pawelwlodarski.cw2

object ScalaDemo2 {
  
  def main(args: Array[String]){
    
    println(List.range(0,10,2))
    println(List.fill(7)(42))
    println(List.tabulate(10)(elem=>s"<div> ${elem} </div>"))
    println("tekst".toList)
    
    
    
    var lista = List.tabulate(20)(elem => elem*elem)
    lista = lista.filter(x => x%3 == 0)
    println(lista)
    
    
    var lista2 = List.range(0,20,3).map(x => x*x)         
    println(lista2)
    
  }

}