package pl.mzerek.scala.nauka.oop.modularyzacja

object modularyzacja {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
  }

  new EchoActor().receiver("Dupa")                //> LOGGING: Dupa
                                                  //| echo Dupa

}