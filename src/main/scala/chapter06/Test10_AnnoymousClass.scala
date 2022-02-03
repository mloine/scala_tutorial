package chapter06

/**
 * @Author mloine
 * @Description 匿名子类
 * @Date 12:17 PM 2022/1/30
 */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    val person = new Person10 {
      override var name: String = "xueyong kang"

      override def eat(): Unit = println("eat")
    }

    println(person.name)
    person.eat()
  }
}

abstract class Person10 {
  var name: String

  def eat(): Unit
}
