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

  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(551); 
  
  val components = List(new Component("jeden"), new Component("dwa"), new Component("trzy"));System.out.println("""components  : List[pl.mzerek.scala.nauka.oop.cw1.cw1.Component] = """ + $show(components ));$skip(57); 
  
  val comp = new Computer(components, 30, "Tomaszow");System.out.println("""comp  : pl.mzerek.scala.nauka.oop.cw1.cw1.Computer = """ + $show(comp ));$skip(23); val res$0 = 
  
  comp.localization;System.out.println("""res0: String = """ + $show(res$0));$skip(29); 
  comp.localization = "Lodz";$skip(20); val res$1 = 
  comp.localization;System.out.println("""res1: String = """ + $show(res$1));$skip(35); 
  
  
  val comp2 = new Computer();System.out.println("""comp2  : pl.mzerek.scala.nauka.oop.cw1.cw1.Computer = """ + $show(comp2 ));$skip(21); val res$2 = 
  comp2.localization;System.out.println("""res2: String = """ + $show(res$2));$skip(32); 
  comp2.localization = "Kraków";$skip(21); val res$3 = 
  comp2.localization;System.out.println("""res3: String = """ + $show(res$3))}
  
}
