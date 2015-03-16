package pl.mzerek.scala.nauka.oop.cw1

object oop {

  class PersonalPassword(val content: String) extends AnyVal {
    override def toString = s"PersonalPassword(${content})"
  }

  class Workshop(password: PersonalPassword, var room: String) {
    override def toString = s"Workshop(${password},${room})"
  }

  val w = new Workshop(password = new PersonalPassword("dupa77#%^"), "Room7")
                                                  //> w  : pl.mzerek.scala.nauka.oop.cw1.oop.Workshop = Workshop(PersonalPassword(
                                                  //| dupa77#%^),Room7)
  w.room                                          //> res0: String = Room7
  w.room = "Room6"
  w.room                                          //> res1: String = Room6
}