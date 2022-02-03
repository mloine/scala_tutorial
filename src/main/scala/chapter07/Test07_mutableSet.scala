package chapter07

import scala.collection.mutable

/**
 * @Author mloine
 * @Description 可变set
 * @Date 3:11 PM 2022/2/2
 */
object Test07_mutableSet {

  def main(args: Array[String]): Unit = {

    val set1: mutable.Set[Int] = mutable.Set[Int](13, 23, 53, 12, 13, 23, 78)

    println(set1)

    println("=====================")

    //1. 添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)

    println("=====================")
    set1 += 11
    println(set1)
    println("=====================")

    val flag1 = set1.add(14)
    val flag2 = set1.add(14)
    println(set1)
    println(f"flag1 = ${flag1}")
    println(f"flag2 = ${flag2}")
    println("=====================")

    set1 -= 14

    println(set1)
    val flag3 = set1.remove(11)
    val flag4 = set1.remove(11)
    println(set1)
    println(f"flag3 = ${flag3}")
    println(f"flag4 = ${flag4}")


    println("=====================")
    //4.合并两个set
    val set3: mutable.Set[Int] = mutable.Set[Int](13, 23, 53, 101, 111)
    println(set1)
    println(set3)

    val set4 = set1 ++ set3

    println(set1)
    println(set3)
    println(set4)


    set1 ++= set3
    println(set1)
    println("=====================")

  }
}
