package pl.mzerek.scala.venkat

object one {

  //for (i <- 1 to 3) { print(i + ",") }

  // for (i <- 1 until 3) { print(i + ",") }
  //
  //(1 to 3).foreach(i => print(i + ","))

  def getPersonInfo(primaryKey: Int) = {
    ("Maciej", "Zerek", "maciej.zerek@gft.com")
  }                                               //> getPersonInfo: (primaryKey: Int)(String, String, String)

  val (firstName, lastName, emailAdress) = getPersonInfo(1)
                                                  //> firstName  : String = Maciej
                                                  //| lastName  : String = Zerek
                                                  //| emailAdress  : String = maciej.zerek@gft.com

  val info = getPersonInfo(1)                     //> info  : (String, String, String) = (Maciej,Zerek,maciej.zerek@gft.com)

  println("First Name is :" + info._1);           //> First Name is :Maciej
  println("First Name is :" + info._2);           //> First Name is :Zerek
  println("First Name is :" + info._3);           //> First Name is :maciej.zerek@gft.com

  println("First Name is :" + firstName);         //> First Name is :Maciej
  println("First Name is :" + lastName);          //> First Name is :Zerek
  println("First Name is :" + emailAdress);       //> First Name is :maciej.zerek@gft.com

  //val (a, b) = (1, 2)

  var a, b, c = 1                                 //> a  : Int = 1
                                                  //| b  : Int = 1
                                                  //| c  : Int = 1
  println(a)                                      //> 1
  println(b)                                      //> 1
  println(c)                                      //> 1


  println("")                                     //> 

}