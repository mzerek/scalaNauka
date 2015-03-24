package pl.mzerek.scala.venkat.sensibleTyping

object pierwszy {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 
  println("Welcome to the Scala worksheet")

  import java.util._;$skip(60); 

    var list2 = new ArrayList[Int];System.out.println("""list2  : java.util.ArrayList[Int] = """ + $show(list2 ));$skip(16); val res$0 = 

  list2 add 1;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(14); val res$1 = 
  list2 add 2;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(19); 
 
  var total = 0;System.out.println("""total  : Int = """ + $show(total ));$skip(73); 
  
  for (index <- 0 until list2.size()) {
    total += list2.get(index)
  };$skip(23); 

  println(total)}

}
