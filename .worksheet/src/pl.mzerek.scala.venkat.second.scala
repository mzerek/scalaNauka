package pl.mzerek.scala.venkat

object second {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  println("Welcome to the Scala worksheet");$skip(46); 

  val list1 = new java.util.ArrayList[Int];

  {;System.out.println("""list1  : java.util.ArrayList[Int] = """ + $show(list1 ));$skip(34); 
    println("Create list1")
  };$skip(83); 

  val list2 = new java.util.ArrayList[Int] {
    println("Create list2")
  };System.out.println("""list2  : java.util.ArrayList[Int] = """ + $show(list2 ));$skip(30); 

  println(list1.getClass());$skip(28); 
  println(list2.getClass());$skip(24); 

  def check1() = true;System.out.println("""check1: ()Boolean""");$skip(38); 
  def check2(): Boolean = return true;System.out.println("""check2: ()Boolean""");$skip(18); 
  println(check1);$skip(18); 
  println(check2)}

}
