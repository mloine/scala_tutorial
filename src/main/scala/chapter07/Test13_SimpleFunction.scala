package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 10:28 PM 2022/2/2
 */
object Test13_SimpleFunction {

  def main(args: Array[String]): Unit = {

    val list = List(5, 1, 8, 2, -3, 4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))

    //1.求和
    println("============================")
    var sum = 0
    for (elem <- list) {
      sum += elem
    }
    println(sum)

    println(list.sum)

    //2.求乘机
    println("============================")
    println(list.product)

    //3.最大值
    println("============================")
    println(list.max)
    //  指定排序的映射模式
    println(list2.maxBy[Int]((tuple2: (String, Int)) => {
      tuple2._2
    }))
    println(list2.maxBy[Int](_._2))

    //4.最小值
    println("============================")
    println(list.min)
    println(list2.minBy(_._2))

    //5.排序
    println("============================")
    //5.1 sorted
    val sortList = list.sorted
    println(sortList)

    //DESC  排序
    //    println(sortList.reverse)
    // 传入隐式参数
    val sortListDesc = list.sorted(Ordering[Int].reverse)
    println(sortListDesc)


    println(list2.sorted)
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering.Int.reverse))

    //5.3 sortWith直接传入比较器
    println(list.sortWith((a: Int, b: Int) => {
      a > b
    }))

    println(list.sortWith((a: Int, b: Int) => {
      a < b
    }))

    println(list.sortWith((a, b) => a < b))
    println(list.sortWith(_ < _))
    println(list.sortWith(_ > _))

  }
}
