package chapter07

/**
 * @Author mloine
 * @Description 元组
 * @Date 9:18 PM 2022/2/2
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {

    // 此处是一个四元组
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)

    println(tuple)

    //2.访问元祖当中的数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    println(tuple.productElement(0))

    println("==================================")
    //3.遍历元组中的所有元素
    for (elem <- tuple.productIterator) {
      println(elem)
    }


    //4.嵌套元组合
    val mulTuple = (12, 0.3, "hello", (23, "scala"), 29)

    println(mulTuple._4._2)
  }
}
