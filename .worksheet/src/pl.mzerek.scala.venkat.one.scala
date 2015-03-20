package pl.mzerek.scala.venkat

object one {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(277); 

  //for (i <- 1 to 3) { print(i + ",") }

  // for (i <- 1 until 3) { print(i + ",") }
  //
  //(1 to 3).foreach(i => print(i + ","))

  def getPersonInfo(primaryKey: Int) = {
    ("Maciej", "Zerek", "maciej.zerek@gft.com")
  };System.out.println("""getPersonInfo: (primaryKey: Int)(String, String, String)""");$skip(62); 

  val (firstName, lastName, emailAdress) = getPersonInfo(1);System.out.println("""firstName  : String = """ + $show(firstName ));System.out.println("""lastName  : String = """ + $show(lastName ));System.out.println("""emailAdress  : String = """ + $show(emailAdress ));$skip(32); 

  val info = getPersonInfo(1);System.out.println("""info  : (String, String, String) = """ + $show(info ));$skip(42); 

  println("First Name is :" + info._1);$skip(40); ;
  println("First Name is :" + info._2);$skip(40); ;
  println("First Name is :" + info._3);$skip(44); ;

  println("First Name is :" + firstName);$skip(41); ;
  println("First Name is :" + lastName);$skip(44); ;
  println("First Name is :" + emailAdress);$skip(46); ;

  //val (a, b) = (1, 2)

  var a, b, c = 1;System.out.println("""a  : Int = """ + $show(a ));System.out.println("""b  : Int = """ + $show(b ));System.out.println("""c  : Int = """ + $show(c ));$skip(13); 
  println(a);$skip(13); 
  println(b);$skip(13); 
  println(c);$skip(18); 


  println("")}

}
