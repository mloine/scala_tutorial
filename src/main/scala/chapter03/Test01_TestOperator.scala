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

    // 复制操作符号
    //    var b: Byte = 10
    //    b += (1.toByte)
    var i: Int = 10
    i += 1
    print(i)

    //位运算符
    print("---位运算符---")
    val a: Byte = 60
    val b: Byte = 13
    //与
    println(a & b)
    //或
    println(a | b)
    //异或
    println(a ^ b)
    //取反
    println(~a)
    //左移
    println(a << 2)
    //右移动
    println(a >> 2)
    //无符号右移动
    println(a >>> 2)

    println(a << 3)

    println("c")
    val c: Short = -13
    println(b << 2)
    println(b >> 2)
    println(b >>> 2)


    /**
     * scala中 运算符的本质
     * 本质是对象的方法调用
     * scala 一切面对对象
     */
    val n1: Int = 12
    val n2: Int = 37
    println(n1.+(n2))
    println(n1 + n2)

    print(n1 + (n2))


    println(7.6 toInt)

  }

}
