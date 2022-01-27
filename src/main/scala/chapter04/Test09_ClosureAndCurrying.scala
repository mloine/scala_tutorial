package chapter04

/**
 * @Author mloine
 * @Description 柯里化 和 闭包
 * @Date 6:29 PM 2022/1/25
 */
object Test09_ClosureAndCurrying {

  def main(args: Array[String]): Unit = {

    def add(a: Int, b: Int): Int = a + b

    //1.考虑固定一个加数的场景
    def addByFour(b: Int): Int = 4 + b

    //2.扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    //3.将固定加数作为参数传入 作为第一层参数传入
    def addByFour1(): Int => Int = {
      val a = 4

      def add(b: Int) = a + b

      add _
    }

    def addByA(a: Int): Int => Int = {
      def add(b: Int) = a + b

      add
    }

    println(addByA(35)(24))

    val addByFour2 = addByA(4)

    println(addByFour2(121))

    println(addByFour2(131))

    // lambda 表达式的简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => a + b
    }

    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    def addByA3(a: Int): Int => Int = {
      a + _
    }

    def addByA4(a: Int): Int => Int = a + _

    val addByFour3 = addByA(3)
    val addByFour4 = addByA(4)

    println(addByFour3(3))
    println(addByFour4(3))

    //参数的柯里化
    def addCurrying(a: Int)(b: Int): Int = a + b

    println(addCurrying(25)(34))

    //递归
    def digui(i:Int):Int = {

      if(i==1){
        return 1
      }

      digui(i-1)*i
    }

    println(digui(5))

  }
}
