package chapter04

object Test01_FunctionAndMethod {

  def main(args: Array[String]): Unit = {

    // 定义函数
    def sayHi(name: String): Unit = {
      println(f"hi,${name}")
    }

    sayHi("mloine")

    //  调用对象的方法
    Test01_FunctionAndMethod.sayHi("bobe")


    val name = Test01_FunctionAndMethod.sayHello("alice")
    println(name)

  }

  // 定义对象的方法
  def sayHi(name: String): Unit = {
    println(f"Hi,${name}")
  }


  def sayHello(name: String): String = {
    println(f"Hi,${name}")
    return name
  }

}
