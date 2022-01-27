package chapter04

/**
 * @Author mloine
 * @Description
 * @Date 11:57 PM 2022/1/26
 */
object Test13_Lazy {

  def sum(i: Int, i1: Int): Int = {
    println("sum ing ........")
    i + i1
  }

  def main(args: Array[String]): Unit = {
    // 懒加载
    lazy val result: Int = sum(13, 47)

    println("------------------------------")
    println(f"result:$result")
    println(f"4 result:$result")
  }

}
