package chapter06

import scala.beans.BeanProperty

object Test03_class {
  def main(args: Array[String]): Unit = {
    val student = new Student
    // 不同访问private
    //    student.name
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)

  }
}

// 定义类 不加修饰符号 默认是public
class Student {

  // 定义属性 不加修饰符号 默认是public
  private var name: String = "alice"

  @BeanProperty
  var age: Int = _

  var sex: String = _
                                              
}
