package chapter05

import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
 * @Author mloine
 * @Description
 * @Date 11:43 PM 2022/1/22
 */
object Test06_Break {
  def main(args: Array[String]): Unit = {
    //采用抛出异常的方式 推出循环
    try {
      for (i <- 1 until 5) {
        if (i == 3) {
          throw new RuntimeException
        }
        println(i)
      }
    } catch {
      case e: Exception => //什么都不做
    }

    //2. 使用scala中的Breaks类中的break方法 实现异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 1 until 5) {
        if (i == 3) {
          Breaks.break()
        }
        println(i)
      }
    )


    breakable(
      for (i <- 1 until 5) {
        if (i == 3) {
          break()
        }
        println(i)
      }
    )

    println("这是循环外的代码")


  }
}
