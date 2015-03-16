package pl.mzerek.scala.nauka.multiConstructorsDemo

class Person(val firstName : String, val lastName: String, val age: Int){
    def this(firstName: String){
      this(firstName, "", 0)
      println("\nNo last name or age given.")
    }
    
     def this(firstName: String, lastName: String){
       this(firstName, lastName, 0)
       println("\nNo age given.")
     }
     
     
     override def toString:String = {
       return "%s %s, age %s".format(firstName, lastName, age)
     }
     
     
}