package chapter02

import chapter01.Student

object Test07_DataType {

  def main(args: Array[String]): Unit = {

    // 1.正数类型
    val a1: Byte = 127
    val a2: Byte = -128

    //正数默认类型是Int
    val a3 = 12

    //长整形数值定义
    val a4: Long = 2134213123213213232L

    val b1: Byte = 10

    val b2: Byte = (10 + 20)
    println(b2)

    //    val b3:Byte = b1 + 20
    val b3: Byte = (b1 + 20).toByte
    println(b3)

    //2. 浮点类型
    val f1: Float = 1.2345f
    val d1 = 1.2345


    //3. 字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    //特殊字符
    val c3: Char = '\t'
    val c4: Char = '\n'

    println(f"abc${c3}def")
    println(f"abc${c4}def")

    // 转义字符
    val c5 = '\\'
    val c6 = '\"'
    println(f"${c5}${c6}")

    //字符变量 底层保存的是整型数据 对应的ASCII码
    val i1: Int = c1
    println(f"i1:${i1}")
    val i2: Int = c2
    println(f"i2:${i2}")

    val c7: Char = (i1 + 1).toChar
    println(f"c7:${c7}")

    val c8: Char = (i2 - 1).toChar
    println(f"c8:${c8}")

    //4. 布尔类型
    val isTrue: Boolean = true
    println(isTrue)


    //5. 空类型
    //5.1控制 Unit
    def m1(): Unit = {
      println("m1 被调用执行")
    }

    val a: Unit = m1()
    // () 空括号
    println(f"Unit:${a}")

    //5.2 空引用
    //    val n:Int = null //值类型 不能接受空引用
    //    var student:Student = new Student("alice", 20)
    var student: Student = null
    student = null
    println(f"student:${student}")

    //5.3 Nothing 是所有类型的子类
    def m2(n: Int): Int = {
      if (n == 0) {
        throw new NullPointerException
      } else {
        return n
      }
    }

    val b: Int = m2(2)

    println(f"b:${b}")

  }

}
