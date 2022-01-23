package chapter05

/**
 * @Author mloine
 * @Description
 * @Date 7:54 PM 2022/1/21
 */
object Test02_ForLoop {

  def main(args: Array[String]): Unit = {
    // java for 语法 for(int i = 0;i<10;i++){System.out.println(i)}

    //scala 范围便利
    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1.to(10)) {
      println(i)
    }


    println("=================Range==================")
    for (i <- Range(1, 10, 1)) {
      print(i)
    }
    print("\n")
    for (i <- Range.inclusive(1, 10, 1)) {
      print(i)
    }
    print("\n")
    println("=================Range==================")


    for (i <- 1 until 10) {
      println(i + ".helloworld")
    }

    println("============集合遍历=======================")
    //集合遍历
    for (i <- Array(12, 34, 53)) {
      println(i)
    }
    for (i <- List(12, 34, 53)) {
      println(i)
    }
    for (i <- Set(12, 34, 53)) {
      println(i)
    }

    println("-----------------循环守卫-------------------")
    //循环守卫
    for (i <- 1 to 3 if i != 2) {
      println(i)
    }

    for (i <- 1 to 10) {
      if (i != 5) {
        println(i)
      }
    }

    for (i <- 1 to 10 if i != 5) {
      println(i)
    }


    println("--------------------循环步长---------------------------")
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    for (i <- 13 to 30 by 3) {
      println(i)
    }

    println("---------------------步长是负数-------------------------")

    for (i <- 30 to 13 by -2) {
      println(i)
    }


    for (i <- 10 to 1 by -1) {
      println(i)
    }


    for (i <- 10 to 1 reverse) {
      println(i)
    }

    // step不能为 0
    //    for(i <- 10 to 1 by 0){
    //      println(i)
    //    }

    for (data <- 1.0 to 10.0 by 0.5) {
      println(data)
    }
    println("---------------------嵌套循环-------------------------")

    //5. 嵌套循环
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(f"i=${i},j=${j}")
      }
    }
    println("---------------------嵌套循环-------------------------")

    for (i <- 1 to 4; j <- 1 to 5; k <- 1 to 6) {
      println(f"i=${i},j=${j},k=${k}")
    }

    println("---------------------9x9乘法表-------------------------")
    for (i <- 1 to 9; j <- 1 to i) {
      val tmp = if (j == i) {
        "\n"
      } else {
        ""
      }
      print(f"${j}*${i}=${j * i}\t${tmp}")
    }

    println("---------------------循环引入变量-------------------------")

    for (i <- 1 to 10) {
      val j = 10 - i
      println(f"i=$i,j=$j")
    }

    //    循环引入变量
    for (i <- 1 to 10; j = 10 - i) {
      println(f"i=$i,j=$j")
    }

    // 代码块 声明循环变量 类似计算属性
    for {i <- 1 to 10
         j = 10 - i
         } {
      println(f"i=$i,j=$j")
    }

    println("---------------------for循环返回值-------------------------")

    //循环返回值
    val rs = for (i <- 1 to 10) yield i * 2
    print(f"rs:\t${rs}")
    print(rs)


    for (item <- rs) {
      println(item)
    }

    println("--------------------- 循环中断 -------------------------")


  }

}
