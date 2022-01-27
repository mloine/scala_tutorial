package chapter04
/**
 * @Author mloine
 * @Description 控制抽象
 * @Date 10:53 PM 2022/1/25
 */
object Test11_ControAbstrction {

  def main(args: Array[String]): Unit = {

    //1.值传递
    def f0(n:Int) :Unit = {
      println(f"a:$n")
      println(f"a:$n")
      println(f"a:$n")
    }

    f0(23)

    def f1():Int = {
      println("f1调用")
      12
    }

    f0(f1())

    //2.传名参数 控制抽象
    // 代码块的放回值必须是Int
    def f2(n: => Int) :Unit = {
      println(f"a:$n")
      println(f"a:$n")
    }

    f2({
      println("我是传入的代码块")
      1
    })

    println("===================================================")

    f2(f1)



  }

}
