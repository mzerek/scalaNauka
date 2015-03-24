package pl.mzerek.scala.venkat

object trzeci {

	class Vehicle(val id:Int, val year:Int){
		override def toString() : String = "ID: " + id + "Year: " + year
	}
	
	class Car(override val id: Int, override val year: Int, var fuelLevel: Int) extends Vehicle(id, year){
	
				override def toString() : String = super.toString() + " Fuel level " + fuelLevel
	
	}
	
	val car = new Car(1, 2009, 100)           //> car  : pl.mzerek.scala.venkat.trzeci.Car = ID: 1Year: 2009 Fuel level 100
	println(car)                              //> ID: 1Year: 2009 Fuel level 100
	
	
	

	

}