package pl.mzerek.scala.nauka.oop.cw2

object Workshop {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(199); 

  def main(args: Array[String]) {

    val work1 = create("Test");
    println(work1)

    val work2 = create();
    println(work2)

  };System.out.println("""main: (args: Array[String])Unit""");$skip(50); 

  def create(room: String) = new Workshop(room);System.out.println("""create: (room: String)pl.mzerek.scala.nauka.oop.cw2.Workshop""");$skip(32); 
  def create() = new Workshop();System.out.println("""create: ()pl.mzerek.scala.nauka.oop.cw2.Workshop""")}

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

  