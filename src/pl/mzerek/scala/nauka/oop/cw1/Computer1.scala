package pl.mzerek.scala.nauka.oop.cw1


class Component1(val name:String) extends AnyVal 

class Computer1 (component:List[Component1], val price:Int){
   
  override def toString = s"Computer(${component}, ${price})"
  
}
