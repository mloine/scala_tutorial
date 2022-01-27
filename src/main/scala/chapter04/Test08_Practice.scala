package chapter04

/**
 * @Author mloine
 * @Description 练习
 * @Date 12:07 AM 2022/1/25
 */
object Test08_Practice {

  def main(args: Array[String]): Unit = {

    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))


    println("==================================================")

    def func(i: Int): (String) => (Char => Boolean) = {

      def f1(s: String): (Char) => Boolean = {

        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }

        f2
      }

      f1
    }

    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(0)("1")('0'))
    println(func(1)("")('0'))


    println("=====================匿名函数=============================")

    def func1(i: Int): (String) => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    println(func1(0)("")('0'))
    println(func1(0)("")('1'))
    println(func1(0)("1")('0'))
    println(func1(1)("")('0'))


    println("=====================柯里化&闭包=============================")
    // 函数的柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    
  }
}
