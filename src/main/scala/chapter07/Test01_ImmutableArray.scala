package chapter07

/**
 * @Author mloine
 * @Description 数组的创建
 * @Date 11:01 PM 2022/1/30
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1.创建数组
    val arr: Array[Int] = new Array[Int](5)

    //2.调用伴生对象的 apply方法
    //    val array = Array.apply(Int, 10)

    val arr2 = Array.apply(5, 1, 2, 3, 4)
    //    for (item <- arr2) {
    //      println(item)
    //    }

    //2.访问方法
    println(arr(0))
    println(arr(1))
    println(arr(4))
    //    println(arr2(5))

    arr(0) = 12
    arr(4) = 57

    println(arr(0))
    println(arr(1))
    println(arr(4))

    var arrTwice = for (item <- arr2) yield item * 2

    println(arrTwice.mkString(","))

    println("====================================")
    //3.循环做数组的遍历
    //1) 普通for循环
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
    println("====================================")
    for (i <- arr.indices) {
      println(arr(i))
    }
    println("====================================")

    //2) 直接遍历所有元素
    for (elem <- arr2) {
      println(elem)
    }

    println("====================================")
    //3) 迭代器使用
    val iterator = arr2.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }
    println("====================================")
    //4） foreach
    arr2.foreach((x: Int) => println(x))

    val ints = arr2.map((x) => 2 * x)
    arr2.toStream.map(2 * _).foreach(println(_))
    println(ints.mkString(","))


    //4.数组中添加元素
    println("==============4.数组中添加元素======================")
    // 追加元素 :+()
    val ints1 = arr2.:+(73)
    println(arr2.mkString("---"))
    println(ints1.mkString("---"))

    //前追加 +:()
    val newArr2 = ints1.+:(30)
    println(newArr2.mkString("---"))

    val newArr3 = newArr2 :+ 55
    println(newArr3.mkString("---"))

    val newArr4 = 19 +: 29 +: newArr3 :+ 26 :+ 73
    println(newArr4.mkString("---"))


  }
}
