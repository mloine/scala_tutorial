package chapter07

/**
 * @Author mloine
 * @Description 多维数组
 * @Date 1:58 PM 2022/1/31
 */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    val array = Array.ofDim[Int](2, 3)


    //2.访问数组
    array(0)(2) = 19
    array(1)(0) = 25


    for (x <- array) {
      for (y <- x) {
        print(f"$y\t")
      }
      println()
    }

    println(array.mkString(","))


    for (i <- 0 until array.length; j <- 0 until array(i).length) {
      println(array(i)(j))
    }


    for (i <- array.indices; j <- array(i).indices) {

      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) {
        println()

      }
    }
    println("===========省略=================")
    array.foreach(_.foreach(println(_)))

  }
}
