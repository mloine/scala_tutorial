package chapter05

/**
 * @Author mloine
 * @Description
 * scala 推荐使用for循环 不推荐使用while循环
 * @Date 11:34 PM 2022/1/22
 */
object Test05_While {

  def main(args: Array[String]): Unit = {

    //while
    var a: Int = 10

    while (a >= 1) {
      println(f"this is a while loop: $a")
      a -= 1
    }


    var b: Int = 0
    do {
      println(f"this is a do while loop : ${b}")
      b -= 1
    } while (b > 0)
  }

}
