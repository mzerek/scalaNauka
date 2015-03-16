package pl.mzerek.scala.nauka.pawelwlodarski.cw5

object ScalaDemo5 {
   val words = Vector("elektromagnetyczny", "pierun", "trzy")
  val vowels = Vector('a', 'e', 'u', 'y')

  def main(args: Array[String]) {

    val words2 = Vector("elektromagnetyczny", "pierun", "trzy")
    val vowels2 = Vector('a', 'e', 'u', 'y')

    println(words2.map(e => keepVowels2(e, vowels2)).flatten)
    
    
    println(words.map(keepVowels).flatten)
    println(words.flatMap(keepVowels))
    
    //z cw5
    var lista = List(1,2,3).flatMap(e=>List(e,e))
    println(lista)
    
    //flatMap other example

    
  }

  def keepVowels(s: String) = s.toCharArray().filter(vowels contains (_))

  def keepVowels2(s: String, vol: Vector[Char]): Array[Char] = { 
    s.toCharArray().filter(vol contains (_)) 
   }

}