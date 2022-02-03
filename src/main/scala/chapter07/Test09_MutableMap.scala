package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {

    val map1: mutable.Map[String, Int] = mutable.Map[String, Int]("a" -> 1, "b" -> 2, "hello" -> 25)
    println(map1)
    println(map1.getClass)

    println("=================================================")
    //1.添加元素
    map1.put("a", 1)
    map1.put("c", 5)
    map1.put("d", 9)

    map1 += (("e", 7))
    println(map1)

    println("=================================================")


    //3. 删除元素
    println(map1("a"))
    map1.remove("a")
    println(map1.getOrElse("a", 0))

    map1 -= "c"
    println(map1)

    println("=================================================")

    //4.修改元素
    map1.update("c", 8)
    map1.update("e", 10)
    println(map1)

    //5.合并两个map

    val map2: Map[String, Int] = Map[String, Int]("aaa" -> 11, "b" -> 29, "hello" -> 5)

    //    map1 ++= map2
    println("=================================================")
    println(map1)
    println(map2)

    val map3 = map2 ++ map1
    println(map3)

    println("=================================================")

  }
}
