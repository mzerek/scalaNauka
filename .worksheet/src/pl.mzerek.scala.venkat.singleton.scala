package pl.mzerek.scala.venkat

object singleton {

  class Marker(val color: String) {
    //println("Creating " + this)

    override def toString(): String = "marker color " + color
  }

  object Marker {
    private val markers = Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "green" -> new Marker("green"))
      
      
    def primaryColors = "red, green, blue"

    def apply(color: String) = {
      if (markers.contains(color)) markers(color) else null
    }

  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(572); 
  println("Primary colors are: " +  Marker.primaryColors);$skip(30); 
  
  println(Marker("blue"));$skip(28); 
  
  println(Marker("red"));$skip(31); 
  
  println(Marker("green"));$skip(32); 
  
  println(Marker("yellow"))}

}
