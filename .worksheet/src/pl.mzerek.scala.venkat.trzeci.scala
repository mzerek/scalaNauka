package pl.mzerek.scala.venkat

object trzeci {

	class Vehicle(val id:Int, val year:Int){
		override def toString() : String = "ID: " + id + "Year: " + year
	}
	
	class Car(override val id: Int, override val year: Int, var fuelLevel: Int) extends Vehicle(id, year){
	
				override def toString() : String = super.toString() + " Fuel level " + fuelLevel
	
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(393); 
	
	val car = new Car(1, 2009, 100);System.out.println("""car  : pl.mzerek.scala.venkat.trzeci.Car = """ + $show(car ));$skip(14); 
	println(car)}
	
	
	

	

}
