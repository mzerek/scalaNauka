class PersonalPassword(val content:String) extends AnyVal
class Workshop(password:PersonalPassword)
new Workshop(password=new PersonalPassword("dupa77#%^"))
