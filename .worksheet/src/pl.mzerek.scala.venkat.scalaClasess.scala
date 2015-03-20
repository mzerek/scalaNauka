package pl.mzerek.scala.venkat

object scalaClasess {

	class Person(val firstName: String, val lastName:String){
		private var position: String = _;
		
		println("Creatin" + toString())
		
		def this(firstName:String, lastName:String, posistionHeld:String){
			this(firstName, lastName)
			position = posistionHeld
		}
		
		
		override def toString() : String = {
			firstName + " " + lastName + " holds " + position + " position "
		}
		
	
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(497); 
	
	val john = new Person("Jhon", "Smith", "Analyst");System.out.println("""john  : pl.mzerek.scala.venkat.scalaClasess.Person = """ + $show(john ));$skip(15); 
	println(john);$skip(43); 
	
	val bill = new Person("Bill", "Walker");System.out.println("""bill  : pl.mzerek.scala.venkat.scalaClasess.Person = """ + $show(bill ));$skip(18); 
 	
	println(bill)}
	


}
