package chapter04

import scala.annotation.tailrec

/**
 * @Author mloine
 * @Description
 * @Date 10:28 PM 2022/1/25
 */
object Test10_Recursion {

  def main(args: Array[String]): Unit = {

    println(fact(5))
    println(tailFact(5))
  }

  // 递归实现
  def fact(n: Int): Int = {
    if (n == 1) {
      return 1
    }
    fact(n - 1) * n
  }

  // 尾递归
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, res: Int): Int = {
      if (n == 0) {
        return res
      }
      loop(n - 1, res * n)
    }

    loop(n, 1)
  }


}
