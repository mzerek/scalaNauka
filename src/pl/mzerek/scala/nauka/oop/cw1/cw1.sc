package pl.mzerek.scala.nauka.oop.cw1

object cw1 {


  class Component(val name: String) extends AnyVal{
  	override def toString = s"${name}"
  }

  class Computer(component: List[Component], val price: Int, var localization: String) {
 		println("o kurde jestem konstruktorem!!!")
    override def toString = s"${component}, ${price}, ${localization}"
    println("caly czas jestem konstruktorem")
    
    
    def this() = this(null, 0, null)

  }
  
  val components = List(new Component("jeden"), new Component("dwa"), new Component("trzy"))
                                                  //> components  : List[pl.mzerek.scala.nauka.oop.cw1.cw1.Component] = List(jeden
                                                  //| , dwa, trzy)
  
  val comp = new Computer(components, 30, "Tomaszow")
                                                  //> o kurde jestem konstruktorem!!!
                                                  //| caly czas jestem konstruktorem
                                                  //| comp  : pl.mzerek.scala.nauka.oop.cw1.cw1.Computer = List(jeden, dwa, trzy),
                                                  //|  30, Tomaszow
  
  comp.localization                               //> res0: String = Tomaszow
  comp.localization = "Lodz"
  comp.localization                               //> res1: String = Lodz
  
  
  val comp2 = new Computer()                      //> o kurde jestem konstruktorem!!!
                                                  //| caly czas jestem konstruktorem
                                                  //| comp2  : pl.mzerek.scala.nauka.oop.cw1.cw1.Computer = null, 0, null
  comp2.localization                              //> res2: String = null
  comp2.localization = "Kraków"
  comp2.localization                              //> res3: String = KrakĂłw
  
}