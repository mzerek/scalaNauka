package pl.mzerek.scala.nauka.oop

object OOPNamespace {
    class PersonalPassword(val content: String) extends AnyVal{
  	override def toString = s"PersonalPassword(${content})"
  	
  }
  
  
  class Workshop(password: PersonalPassword, var room:String, private var notatki:String){
  
  println(s"""notatki prowadzącego "${notatki}"""")
  	override def toString = s"Workshop(${password},${room})"
  	
  	
  	def this() = this(new PersonalPassword(null), "", "")
  	
  	
  	
  	
  	
  	
  	
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(623); 
  
  
  val ww = new Workshop(password = new PersonalPassword("dupa77#%^"), "Room7", "nie stresować się, przygotować suchary");System.out.println("""ww  : pl.mzerek.scala.nauka.oop.OOPNamespace.Workshop = """ + $show(ww ));$skip(9); val res$0 = 
	ww.room;System.out.println("""res0: String = """ + $show(res$0));$skip(19); 
	ww.room = "Room6";$skip(9); val res$1 = 
	ww.room;System.out.println("""res1: String = """ + $show(res$1))}
	
	
	
	
	
	
	
}
