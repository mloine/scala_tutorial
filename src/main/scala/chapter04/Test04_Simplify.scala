package chapter04

/**
 * @Author mloine
 * @Description 函数的至简原则
 * @Date 4:03 PM 2022/1/23
 */
object Test04_Simplify {

  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("xue yong kang"))

    //1.return 可以省略 scala会用最后一行代码作为返回值
    println("===========================")

    def f1(name: String): String = {
      name
    }

    println(f1("xue yong kang"))

    //2.如果函数体只有一行代码 可以身略花括号
    println("===========================")

    def f2(name: String): String = name

    println(f2("xue yong kang"))

    //3.如果返回值的类型编译器可以推断出来 那么可以省略
    println("===========================")

    def f3(name: String) = name

    println(f3("xue yong kang"))

    //4.如果有return 则不能省略返回值类型
    println("===========================")

    def f4(name: String): String = return name

    println(f4("xue yong kang"))

    //5.如果函数明确声明unit 那么函数中使用return 也不起作用
    println("===========================")

    def f5(name: String): Unit = return name

    println(f5("xue yong kang"))

    //6.scala 中如果期望是无返回值类型 可以直接省略等号

    println("===========================")

    def f6(name: String) {
      println(name)
    }

    println(f6("xue yong kang"))

    //7.如果函数无参 但是声明了参数列表 那么调用的时候 小括号 可加 可不加
    println("===========================")

    def f7(): Unit = {
      println("xueyongkang")
    }

    f7()
    f7

    //8.如果函数没有参数列表 那么 小括号都能省略 但调用的时候不能加上小括号
    println("===========================")

    def f8: Unit = {
      println("xueyongkang f8")
    }

    f8
    //    f8()

    //9.如果不关心名称 只关心处理逻辑 那么函数名 和 def都能省略
    println("===========================")

    def f9(name: String): Unit = {
      println(name)
    }

    println("===========================")
    //    没有名称的函数 匿名函数 lambda表达式
    (name: String) => {
      println(name)
    }


  }
}
