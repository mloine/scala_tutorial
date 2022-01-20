package chapter02

/**
 * @Author mloine
 * @Description
 * @Date 12:13 AM 2022/1/14
 */
object Test08_DateTypeConversion {

  def main(args: Array[String]): Unit = {
    /**
     * 自动类型转换
     */
    //    1.自动提升原则
    val a1: Byte = 10
    val b1: Long = 2353L
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1.toInt)

    //2. 高精度 到 低进度
    val a2: Byte = 10
    val b2: Int = a2
    val c2: Byte = b2.toByte


    //3. byte short 和 char之间不会相互进行自动转换
    val a3: Byte = 10
    val b3: Char = 'v'

    val c3: Int = b3
    println(c3)

    // byte short char 可以·计算 需要首先转换成int类型
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'

    val result4: Int = a4 + b4
    val result44: Int = a4 + b4 + c4

    /**
     * 强制类型转换
     */
    val n1: Int = 2.5.toInt
    println(n1)

    val n2: Int = 2.6.toInt + 3.7.toInt
    println(f"n2${n2}")

    val n3: Int = (2.6 + 3.7).toInt
    println(f"n3${n3}")

    //数值类型 和 String 类型的转换
    val n: Int = 27
    val s: String = n + ""
    println(1.toString)
    println(s)

    //    String > Int
    val m: Int = "12".toInt
    val f:Float = "12.3".toFloat
//    val f2:Int = "12.3".toInt   报错
    val f2:Int = "12.3".toDouble.toInt

  }

}
