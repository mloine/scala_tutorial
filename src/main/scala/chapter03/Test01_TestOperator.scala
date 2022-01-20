package chapter03

/**
 * @Author mloine
 * @Description
 * @Date 11:42 PM 2022/1/16
 */
object Test01_TestOperator {

  def main(args: Array[String]): Unit = {

    //1.算数运算符号
    val result1: Int = 10 / 3
    println(result1)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10d / 3d
    // 前面是位数 后面是精度
    println(result3.formatted("%5.2f"))

    val result4 = 10 % 3
    println(result4)

    //2.比较运算符号
    //    println(4==3)

    val s1: String = "hello"
    val s2: String = new String("hello")

    //
    println(s1 == s2)
    println(s1.equals(s2))

    //判断引用地址是否相等
    println(s1.eq(s2))
    println("----------------------")

    //3.逻辑运算符号 逻辑运算符有短路特性  && || !
    def m(n: Int): Int = {
      println("m被调用")
      return n
    }

    val n = 1
    println((4 < 5) && m(n) > 0)

    // 例子 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    println(isNotEmpty(null))


  }

}
