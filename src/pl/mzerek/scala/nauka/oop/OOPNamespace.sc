package pl.mzerek.scala.nauka.oop

object OOPNamespace {
    class PersonalPassword(val content: String) extends AnyVal{
  	override def toString = s"PersonalPassword(${content})"
  	
  }
  
  
  class Workshop(password: PersonalPassword, var room:String, private var notatki:String){
  
  println(s"""notatki prowadzącego "${notatki}"""")
  	override def toString = s"Workshop(${password},${room})"
  	
  	
  	def this() = this(new PersonalPassword(null), "", "")
  	
  	
  	
  	
  	
  	
  	
  }
  
  
  val ww = new Workshop(password = new PersonalPassword("dupa77#%^"), "Room7", "nie stresować się, przygotować suchary")
                                                  //> notatki prowadzÄ…cego "nie stresowaÄ‡ siÄ™, przygotowaÄ‡ suchary"
                                                  //| ww  : pl.mzerek.scala.nauka.oop.OOPNamespace.Workshop = Workshop(PersonalPas
                                                  //| sword(dupa77#%^),Room7)
	ww.room                                   //> res0: String = Room7
	ww.room = "Room6"
	ww.room                                   //> res1: String = Room6
	
	
	
	
	
	
	
}