object abc {
 
class PersonalPassword(val content:String) extends AnyVal
class Workshop(password:PersonalPassword);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(171); val res$0 = 
new Workshop(password=new PersonalPassword("dupa77#%^"));System.out.println("""res0: abc.Workshop = """ + $show(res$0))}






}
