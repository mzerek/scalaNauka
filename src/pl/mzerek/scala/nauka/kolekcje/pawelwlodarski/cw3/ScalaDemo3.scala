package pl.mzerek.scala.nauka.pawelwlodarski.cw3

import List._

object ScalaDemo3 {
  
   def main(args: Array[String]){
     
     var list1 = List.range(0, 30).sortWith((e1,e2) => e1>e2).map(e=>e+1)
     println("list1: " + list1)
     
     var list2 = List.range(0, 30).sortWith(_>_).map(_+1)
     println("list2: " + list2)   
     
     var list3 = List.range(0,30).sortWith(reverse).map(addOne)
     println("list3: " + list3)
     
     var list4 = range(0, 30) sortWith reverse map addOne
     println("list4: " + list4)
     
     println("==== do cwiczenia 3 =====")
     
     var list5 = range(1, 101).filter(x => x>50).sortWith((e1,e2) => e1%2==0)
     println("list5: " + list5)
     
     var list6 = range(1, 101).filter(forFilter).sortWith(forSorting)
     println("list6: " + list6)
     
     
     //with Domanin Specific Language
     var list7 = range(1, 101) filter forFilter sortWith forSorting
     println("list7: " + list7)  
     
     
     
   }
   
   def forFilter(e:Int) = e>50
   
   def forSorting(e1:Int, e2:Int) = e1%2==0   
   
   def reverse(e1:Int, e2:Int)=e1>e2
   
   def addOne(e:Int)=e+1
   
   
  
  
}