package pl.mzerek.scala.nauka.oop.modularyzacja

object modularyzacja {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
  println("Welcome to the Scala worksheet")

  abstract class Actor {
    def receiver(s: String): Unit
  }

  class EchoActor extends Actor with Logging {
    override def receiver(s: String) = {
    	logger.log(s)
      println(s"echo $s")
    }
  }

  trait Logging {
    class Logger {
      def log(s: String) = println(s"LOGGING: $s")
    }

    val logger = new Logger
  };$skip(377); 

  new EchoActor().receiver("Dupa")}

}
