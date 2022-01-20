package chapter02

object Test04_String {

  def main(args: Array[String]): Unit = {


    //1.字符串通过 + 链接
    val name: String = "alice"
    val age: Int = 18

    println(age + "岁的" + name + "在幼儿园学习")

    // * 用于将一个字符串复制多次拼接
    println(name * 3)

    //2.格式化输出
    printf("%d岁的%s在幼儿园学习\n", age, name)


    //3.字符串模版（插值字符串） 通过$获取变量
    println(s"${age}岁的${name}在幼儿园学习")

    val num: Float = 2.3456f

    println(s"The num is ${num}")
    //    格式化模版字符串
    println(f"The num is ${num}%2.2f")
    // 原始 未加工 直接输出
    println(raw"The num is ${num}%2.2f")

    //三引号 表示字符串 保持多行字符串原格式输出
    val rows:String = s"""
      |select *
      |from
      | student
      |where
      | name = ${name}
      | and
      | age > ${age}
      |""".stripMargin

    println(rows)

  }
}
