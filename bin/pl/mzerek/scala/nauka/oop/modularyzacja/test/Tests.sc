package pl.mzerek.scala.nauka.oop.modularyzacja.test

object Tests {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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

  }

  val unitTest = new TestUnit with StringMatchers {
    def domainTest() = mustBeEqual("aa")("aa")
  }                                               //> unitTest  : pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.TestUnit with
                                                  //|  pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.StringMatchers = pl.mzer
                                                  //| ek.scala.nauka.oop.modularyzacja.test.Tests$$anonfun$main$1$$anon$1@1e643faf
                                                  //| 
  unitTest.runTest()                              //> res0: String = test sie udal

  val unitTest2 = new TestUnit with DoubleMatchers {
    def domainTest() = mustBeEqualDouble(11.3)(1.3)
  }                                               //> unitTest2  : pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.TestUnit wit
                                                  //| h pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.DoubleMatchers = pl.mze
                                                  //| rek.scala.nauka.oop.modularyzacja.test.Tests$$anonfun$main$1$$anon$2@7f63425
                                                  //| a
  unitTest2.runTest()                             //> res1: String = test failed!
  
  
  val opt = Option("abcd")                        //> opt  : Option[String] = Some(abcd)
  
   val unitTest3 = new TestUnit with OptionMatchers {
    def domainTest() = mustBeSomeWith(opt)("abcd")
  }                                               //> unitTest3  : pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.TestUnit wi
                                                  //| th pl.mzerek.scala.nauka.oop.modularyzacja.test.Tests.OptionMatchers = pl.m
                                                  //| zerek.scala.nauka.oop.modularyzacja.test.Tests$$anonfun$main$1$$anon$3@5782
                                                  //| 9d67
   unitTest3.runTest()                            //> res2: String = test sie udal
   println(opt.contains(5))                       //> false

}