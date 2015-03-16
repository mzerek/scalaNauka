package pl.mzerek.scala.nauka.gettersAndSetters

class Book {

    private var _title: String = _
  
    def title = _title
  
    def title_= (title: String){
      _title = title
    }


}