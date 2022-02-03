package chapter09

/**
 * @Author mloine
 * @Description 隐式转换
 * @Date 2:01 AM 2022/2/4
 */
object Test02_implicit {

  def main(args: Array[String]): Unit = {

    val new12 = new MyRichInt(12)
    println(new12.myMax(15))


    println("====================隐式转换函数=======================")

    //  implicit 隐式转换
    implicit def convertToMyRichInt(i: Int): MyRichInt = new MyRichInt(i)

    println(12.myMax(15))

    println("=======================2.隐式类====================")
    //2.隐式类
    implicit class MyRichInt2(val self: Int) {

      //自定义比较大小的当发
      def myMax2(n: Int): Int = if (n < self) self else n

      def myMin2(n: Int): Int = if (n < self) n else self

    }

    println(12.myMin2(15))
    println(12.myMax2(15))


    println("=======================3.隐式参数 隐式值的优先级高于默认值====================")
    //3.隐式参数
    implicit val str: String = "alice"
    //        implicit val str1: String = "alice1"
    implicit val num: Int = 1

    //底层式克里化的表现
    def sayHello()(implicit name: String) = println(f"hello :${name}")

    def sayHi(implicit name: String = "mloine") = println(f"hi :${name}")

    sayHello
    sayHi

    //简便写法
    def hiAge():Unit ={
      println("hi, " + implicitly[Int])
    }

    hiAge
  }
}

//自定义类
class MyRichInt(val self: Int) {


  //自定义比较大小的当发
  def myMax(n: Int): Int = if (n < self) self else n

  def myMin(n: Int): Int = if (n < self) n else self

}



