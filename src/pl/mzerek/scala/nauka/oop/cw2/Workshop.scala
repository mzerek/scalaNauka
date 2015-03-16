package pl.mzerek.scala.nauka.oop.cw2

trait Jedzenie {
  def pizza() = "jemy pizze"
}

object Workshop {

  private val defaultNotes = "domyślne notatki"
  private val defaultPassword = "test123%%%"

  def main(args: Array[String]) {

    //val work1 = create("ABCDEFG");
    //println(work1)

    //val work2 = create();
    //println(work2)
    
    println(Workshop("room69"))

  }

  def create(room: String) = new Workshop(password = new PersonalPassword(defaultPassword), room = room, notatki = defaultNotes)
  def create() = new Workshop()

  def apply(room: String) = new Workshop(password = new PersonalPassword(defaultPassword), room = room, notatki = defaultNotes) //with Jedzenie

}

class PersonalPassword(val content: String) extends AnyVal {
  override def toString = s"PersonalPassword(${content})"

}

class Workshop private (password: PersonalPassword, var room: String, private var notatki: String = "jest cool") {
  private def this(room: String) = this(new PersonalPassword("test123"), room)
  private def this() = this("Room20")

  println(s"""notatki prowadzacego "${notatki}"""")

  override def toString = s"Workshop(${password}, ${room})"

}

  