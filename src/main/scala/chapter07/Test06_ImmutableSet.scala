package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 2:56 PM 2022/2/2
 */
object Test06_ImmutableSet {

  def main(args: Array[String]): Unit = {

    //1.创建set
    val set1 = Set[Int](1, 2, 3, 4, 1, 2, 3, 4, 6, 1, 3, 13, 5)

    println(set1)

    println("================================")

    //    val set2 = set1.+(20)
    val set2 = set1 + 20

    println(set1)
    println(set2)

    println("================================")

    //3. 合并set
    val set3 = Set[Int](19, 13, 23, 53, 67, 99)
    val set4 = set3 ++ set2
    println(set3)
    println(set2)
    println(set4)


    println("================================")
    //4.删除
    val set5 = set3 - 13
    println(set3)
    println(set5)
  }
}
