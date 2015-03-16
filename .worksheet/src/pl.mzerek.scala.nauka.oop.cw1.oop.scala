package pl.mzerek.scala.nauka.oop.cw1

object oop {

  class PersonalPassword(val content: String) extends AnyVal {
    override def toString = s"PersonalPassword(${content})"
  }

  class Workshop(password: PersonalPassword, var room: String) {
    override def toString = s"Workshop(${password},${room})"
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(393); 

  val w = new Workshop(password = new PersonalPassword("dupa77#%^"), "Room7");System.out.println("""w  : pl.mzerek.scala.nauka.oop.cw1.oop.Workshop = """ + $show(w ));$skip(9); val res$0 = 
  w.room;System.out.println("""res0: String = """ + $show(res$0));$skip(19); 
  w.room = "Room6";$skip(9); val res$1 = 
  w.room;System.out.println("""res1: String = """ + $show(res$1))}
}
