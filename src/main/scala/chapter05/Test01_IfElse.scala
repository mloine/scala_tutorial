package chapter05

import scala.io.StdIn

/**
 * @Author mloine
 * @Description
 * @Date 6:29 PM 2022/1/21
 */
object Test01_IfElse {

  def main(args: Array[String]): Unit = {
    println("请输入您的年龄:")
    val age: Int = StdIn.readInt()

    if (age >= 18) {
      println("成年")
    }

    println("====================================")

    if (age >= 18) {
      println("成年")
    } else {
      println("未成年")
    }


    println("====================================")

    if (age <= 6) {
      println("童年")
    } else if (age < 18) {
      println("青少年")
    } else if (age < 35) {
      println("中安")
    } else {
      println("老年")
    }

    println("============scala中没有swatch语句===使用模式匹配=====================")

    println("============分之语句的返回值====================")


    val result: Any = if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18) {
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("中年")
      age
    } else {
      println("老年")
      age
    }

    print(f"result:${result}")


    // java中三元运算符 a?b:c age>=18?"成年":"未成年"

    val res: String = if (age >= 18) {
      "成年"
    } else {
      "未成年"
    }
    val res2 = if (age >= 18) "成年" else "未成年"

    // 嵌套分支
    println("=========================================")

    if (age >= 18) {
      println("成年")
      if (age >= 35) {
      } else {
      }
    } else {
      println("未成年")
    }


  }

}
