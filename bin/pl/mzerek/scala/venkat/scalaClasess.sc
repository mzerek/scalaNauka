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
		
	
	}
	
	val john = new Person("Jhon", "Smith", "Analyst")
                                                  //> CreatinJhon Smith holds null position 
                                                  //| john  : pl.mzerek.scala.venkat.scalaClasess.Person = Jhon Smith holds Analys
                                                  //| t position 
	println(john)                             //> Jhon Smith holds Analyst position 
	
	val bill = new Person("Bill", "Walker")   //> CreatinBill Walker holds null position 
                                                  //| bill  : pl.mzerek.scala.venkat.scalaClasess.Person = Bill Walker holds null 
                                                  //| position 
 	
	println(bill)                             //> Bill Walker holds null position 
	


}