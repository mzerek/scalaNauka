package pl.mzerek.scala.nauka.multiConstructorsDemo

object MultipleConstructors {

  def main(args: Array[String]) {
    var a1 = new Person("Alvin", "Alexander", 20)
    println(a1)

    var a2 = new Person("Fred", "Flinston")
    println(a2)
    
    a2 = new Person("DUPA")
    println(a2)

    var a3 = new Person("Ferdynand")
    println(a3)

  }

}