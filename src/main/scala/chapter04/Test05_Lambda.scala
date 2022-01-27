package chapter04

/**
 * @Author mloine
 * @Description
 * @Date 10:15 PM 2022/1/23
 */
object Test05_Lambda {


  def main(args: Array[String]): Unit = {

    val fun: String => Unit = (name: String) => {
      println(name)
    }

    fun("xueyongkang")

    // 定义一个函数 以函数作为一个参数输入
    def f(func: String => Unit): Unit = {
      func("xyk")
    }

    f(fun)

    f((name: String) => {
      println(f"hello param")
    })

    println("============================================")

    // 匿名函数的简化原则

    //1.参数类型可以省略 会更具行参自动推到
    f((name) => {
      println(f"hello param 1 ${name}")
    })


    //2.类型省略后 当前参数只有一个的化 括号可以省略
    f(name => {
      println(f"hello param 2 ${name}")
    })

    //3.匿名函数如果只有一行 则大括号也可以省略
    f(name => println(f"hello param 3 ${name}"))

    //4.如果参数只出现一次 则参数省略且后面的参数可以用_代替
    f(println(_))

    //5.如果可以推断出 当前传入的println是一个函数体 而不是调用语句 可以直接省略_
    f(println)


    // 实际实例 定义一个"二元运算符号" 只操作1和2两个数 但具体的运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => {
      a + b
    }

    val minus = (a: Int, b: Int) => {
      a - b
    }

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    //匿名函数简化
    println(dualFunctionOneAndTwo((a:Int,b:Int)=>{a+b}))
    println(dualFunctionOneAndTwo((a:Int,b:Int)=>{a-b}))

    println(dualFunctionOneAndTwo((a,b)=>{a+b}))

    // _代表的参数 只能使用一次
    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(_ - _))

    //
    println(dualFunctionOneAndTwo((a,b)=>{b-a}))
    println(dualFunctionOneAndTwo(-_ + _))

  }

}
