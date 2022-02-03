package chapter08

/**
 * @Author mloine
 * @Description 变量声明
 * @Date 12:20 AM 2022/2/4
 */
object Test03_MatchTupleExtend {

  def main(args: Array[String]): Unit = {

    //1.可以在变量声明时候匹配
    val (x, y) = (10, "help")
    println(s"x:$x  y:$y")

    val List(first, second, _*) = List(23, 15, 9, 78)
    //    val List(first,second,rest) = List(23,15,9)
    println(f"first $first second $second")


    val fir :: sec :: rest = List(23, 15, 9, 78)
    println(f"fir $fir sec $sec rest $rest")

    println("===================for推导式中 进行模式匹配========================")
    //2. for推导式中 进行模式匹配
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 34))

    //2.1 原本的遍历方式
    for (tuple <- list) {
      println(tuple._1 + "\t" + tuple._2)
    }

    //2.2 将list的元素直接定义成元祖 对变量进行赋值 可读性提高
    for ((word, count) <- list) {
      println(f"$word\t$count")
    }

    //2.3 不考虑某个位置的变量 只遍历key 或者 value
    for ((word, _) <- list) {
      println(f"word $word")
    }


    //2。4 可能的位置必须
    for (("a", count) <- list) {
      println(f"a $count")
    }

  }


}
