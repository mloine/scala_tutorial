package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {


    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    // 使用伴生对象创建
    val list2 = ListBuffer(12, 53, 75)

    println(list1)
    println(list2)

    println("========================")

    list1.append(16, 62)
    list2.prepend(20)

    list1.insert(1, 17, 19, 22)

    println(list1)
    println(list2)

    31 +=: list1 += 25 += 26

    println(list1)
    println("======================")

    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)

    println("======================")

    list1 ++= list2
    println(list1)
    println(list2)

    println("======================")
    list1 ++=: list2
    println(list1)
    println(list2)

    println("======================")

    list2(3) = 30
    println(list2)

    println("======================")

    list2.remove(2)
    println(list2)

    list2 -= 25
    println(list2)


  }
}
