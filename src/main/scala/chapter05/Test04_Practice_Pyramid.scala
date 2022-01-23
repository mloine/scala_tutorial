package chapter05

/**
 * @Author mloine
 * @Description 打印输出一个9层妖塔
 * @Date 10:45 PM 2022/1/22
 */
object Test04_Practice_Pyramid {

  def main(args: Array[String]): Unit = {

    // 2n - 1 个 * && 17 - (2n-1)/2  => 9-n 空格
    val len = 9
    for {i <- 1 to len
         n = 2 * i - 1
         m = len - i
         } {
      println(" " * m + "*" * n)
    }


    for (i <- 1 to len; n = 2 * i - 1; m = len - i
         ) {
      println(" " * m + "*" * n)
    }


    for (stars <- 1 to 17 by 2; space = (17 - stars) / 2) {
      println(" " * space + "*" * stars)

    }


  }

}
