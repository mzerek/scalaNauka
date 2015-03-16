package pl.mzerek.scala.nauka.oop.modularyzacja.test

object Tests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 
  println("Welcome to the Scala worksheet")

  trait StringMatchers {
    def mustBeEqual(source: String)(expected: String) = source == expected
  }

  trait DoubleMatchers {
    def mustBeEqualDouble(source: Double)(expected: Double) = source == expected
  }

  trait OptionMatchers {
    def mustBeSomeWith[A](o: Option[A])(value: A) = o.contains(value)
  }

  abstract class TestUnit {
    def runTest() =
      if (domainTest())
        "test sie udal"
      else
        "test failed!"

    def domainTest(): Boolean

  };$skip(594); 

  val unitTest = new TestUnit with StringMatchers {
    def domainTest() = mustBeEqual("aa")("aa")
  };System.out.println("""unitTest  : pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.TestUnit with pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.StringMatchers = """ + $show(unitTest ));$skip(21); val res$0 = 
  unitTest.runTest();System.out.println("""res0: String = """ + $show(res$0));$skip(111); 

  val unitTest2 = new TestUnit with DoubleMatchers {
    def domainTest() = mustBeEqualDouble(11.3)(1.3)
  };System.out.println("""unitTest2  : pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.TestUnit with pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.DoubleMatchers = """ + $show(unitTest2 ));$skip(22); val res$1 = 
  unitTest2.runTest();System.out.println("""res1: String = """ + $show(res$1));$skip(33); 
  
  
  val opt = Option("abcd");System.out.println("""opt  : Option[String] = """ + $show(opt ));$skip(112); 
  
   val unitTest3 = new TestUnit with OptionMatchers {
    def domainTest() = mustBeSomeWith(opt)("abcd")
  };System.out.println("""unitTest3  : pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.TestUnit with pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.OptionMatchers = """ + $show(unitTest3 ));$skip(23); val res$2 = 
   unitTest3.runTest();System.out.println("""res2: String = """ + $show(res$2));$skip(28); 
   println(opt.contains(5))}

}
