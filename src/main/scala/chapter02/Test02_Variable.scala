package chapter02

import chapter01.Student

object Test02_Variable {

  def main(args: Array[String]): Unit = {
    //声明一个变量 通用语法
    var a: Int = 1


    // 1.类型可以省略 编译器自动推导
    var a1 = 10
    val b1 = 23

    //2.类型确定后，就不能修改 说明scala语言是强数据类型语言
    var a2 = 15
    //    a2 = ""

    //3.变量声明的时候 必须要有初始值
    //    var a3:Int

    //4. 在声明或者变量的时候 var是可修改的 val是不可修改的
    a1 = 11
    //    b1 = 22


    var alice = new Student("alice",20)
    alice = new Student("Alice",20)
    alice = null
//    alice.printInfo()

    val bob = new Student("bob", 20)
    bob.age = 21
    bob.printInfo()

    
  }

}
