package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 9:36 PM 2022/2/2
 */
object Test11_CommonOp {
  def main(args: Array[String]): Unit = {

    val list = List(1, 3, 5, 7, 2, 89)
    val set = Set(23, 43, 23, 21, 564)

    //1. 获取集合的长度
    println(list.length)

    //2. 获取集合的大小
    println(set.size)
    println("======================")
    //3. 循环遍历
    for (elem <- list)
      println(elem)

    println("======================")
    list.foreach(println)

    println("======================")

    //4. 迭代器循环
    for (elem <- list.iterator) {
      println(elem)
    }
    //5. 生成字符串
    println("======================")
    println(list)
    println(set)
    println(Array(1, 2, 3, 4, 5).mkString(","))
    println(list.mkString("---"))

    //6. 是否包含元素
    println("======================")

    println(list.contains(23))
    println(set.contains(23))


  }
}
