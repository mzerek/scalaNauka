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

  }
  println("Primary colors are: " +  Marker.primaryColors)
                                                  //> Primary colors are: red, green, blue
  
  println(Marker("blue"))                         //> marker color blue
  
  println(Marker("red"))                          //> marker color red
  
  println(Marker("green"))                        //> marker color green
  
  println(Marker("yellow"))                       //> null

}