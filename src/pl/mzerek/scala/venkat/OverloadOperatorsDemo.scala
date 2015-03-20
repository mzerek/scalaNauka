package pl.mzerek.scala.venkat

object OverloadOperatorsDemo {
  def main(args: Array[String]): Unit = {

    val c1 = new Complex(1, 2)
    val c2 = new Complex(2, -3)
    val c3 = new Complex(2, 2)
    val sum = c1 + c2
    println("(" + c1 + ") + (" + c2 + ") = " + sum)
    val diff = c1 - c2
    println("(" + c1 + ") - (" + c2 + ") = " + diff)
    val multi = c1 * c2
    println("(" + c1 + ") * (" + c2 + ") = " + multi)
    
    
    println("==================")

    println(c1 + c2 * c3)
    
    
    
    var a, b, c = 1
    
    a = b
    
    a = c

  }
}

class Complex(val real: Int, val imiginary: Int) {

  def +(x: Complex): Complex = {
    println("Calling +")
    new Complex(real + x.real, imiginary + x.imiginary)
  }

  def -(x: Complex): Complex = {
    println("Calling -")
    new Complex(real - x.real, imiginary - x.imiginary)
  }

  def *(x: Complex): Complex = {
    println("Calling *")
    new Complex(real * x.real - imiginary * x.imiginary, real * x.imiginary - imiginary * x.real)
  }

  override def toString(): String = {
    real + (if (imiginary < 0) "" else "+") + imiginary + "i"
  }
  
  
  

}