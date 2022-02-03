package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {

    val list1 = List(1, 3, 5, 7, 2, 89)
    val list2 = List(3, 7, 2, 45, 4, 8, 19)
    val set = Set(23, 43, 23, 21, 564)

    //1.获取集合的头 head
    println("==========================================")
    println(list1.head)

    //2.获取集合的尾 去掉头后剩下的都是尾 tail
    println("==========================================")
    println(list1.tail)

    //3.集合总的最后一个元素 last
    println("==========================================")
    println(list2.last)

    //4.获取初始元素 不是尾巴的都是初始元素 init
    println("==========================================")
    println(list2.init)

    //5.反转
    println("==========================================")
    println(list1.reverse)

    //6. 取前n个元素
    println("==========================================")
    println(list1.take(3))
    println(list1.takeRight(4))

    //7. 去掉前（后）n个元素
    println("==========================================")
    println(list1.drop(3))
    println(list1.dropRight(4))

    //8. 并集
    println("==========================================")
    val union = list1.union(list2)
    println(union)
    println(list1 ::: list2)

    //如果是set做并集 会做去重
    val set1 = Set(1, 3, 5, 7, 2, 89)
    val set2 = Set(3, 7, 2, 45, 4, 8, 19)
    val union2 = set1.union(set2)
    println(union2)
    println(set1 ++ set2)

    //9. 交集 union
    println("==========================================")
    val intersection = list1.intersect(list2)
    println(intersection)

    //10. 差集 差异化 存在A但不在B中存在的 diff
    println("==========================================")
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println("diff1" + diff1)
    println("diff2" + diff2)

    //11.拉链 zip
    println("==========================================")
    println("zip:" + list1.zip(list2))
    println("zip:" + list2.zip(list1))

    //12.滑窗 sliding
    println("==========================================")
    println(list1.sliding(3))
    list1.sliding(3).foreach(println(_))
    println("------------------------------------------")

    for (elem <- list1.sliding(4, 2)) {
      println(elem)
    }

    println("------------------------------------------")
    // 滚动窗口
    for (elem <- list1.sliding(3, 3)) {
      println(elem)
    }
  }
}
