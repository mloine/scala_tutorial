package chapter08

/**
 * @Author mloine
 * @Description 偏函数
 * @Date 1:08 AM 2022/2/4
 */
object Test06_PartialFunction {

  def main(args: Array[String]): Unit = {

    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 34))

    //1. map 转换实现key 不变 value * 2
    val newList = list.map(tuple2 => (tuple2._1, tuple2._2 * 2))
    println(newList)

    //2. 用模式匹配对元组元素fuzhi 实现功能
    val newList2 = list.map(tuple2 => {
      tuple2 match {
        case (word, count) => (word, count * 2)
      }
    })
    println(newList2)


    //省略 lambda表达式的写法 进行简化  此处其实是一个偏函数
    val newList3 = list.map {
      case (word, count) => (word, count * 2)
    }
    println(newList3)

    // 偏函数的应用,  求绝对值
    // 针对输入的数据 分为不同的情形 + - 0
    println("================================================")
    val positiveAps: PartialFunction[Int, Int] = {
      case x: Int if x > 0 => x
    }

    val negativeAps: PartialFunction[Int, Int] = {
      case x: Int if x < 0 => -x
    }

    val zeroAps: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = {
      // 偏函数 组合函数
      (positiveAps orElse negativeAps orElse zeroAps) (x)
    }

    println(abs(-1))
    println(abs(6))
    println(abs(0))
  }
}
