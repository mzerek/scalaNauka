package pl.mzerek.scala.nauka.gettersAndSetters

object SetterGetterDemo {
  
  def main(args: Array[String]){
    
    var book = new Book
    
    println(book.title)
    
    book.title_=("dupa")

    println(book.title)
  }

}