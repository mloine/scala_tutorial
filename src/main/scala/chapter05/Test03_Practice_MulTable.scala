package chapter05

/**
 * @Author mloine
 * @Description 9 * 9 乘法表
 * @Date 10:39 PM 2022/1/22
 */
object Test03_Practice_MulTable {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j}\t")
      }
      println()
    }

    println("scala")

    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j}\t")
      if (j == i) println()
    }


  }

}
