package chapter06
/**
 * @Author mloine
 * @Description 抽象类
 * @Date 12:06 PM 2022/1/30
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student:Person9 = new Student9

    student.eat()

    student.sleep()
  }
}

abstract class Person9 {

  // 常量定义
  val name: String = "person"

  // 抽象属性
  var age: Int

  // 方法
  def eat(): Unit = {
    println("person eat")
  }

  // 抽象方法
  def sleep(): Unit

}

//定义具体的实现子类
class Student9 extends Person9 {

  /**
   * 实现 抽象属性 和抽象方法
   */
  override var age: Int = _

  override def sleep(): Unit = {
    println("person sleep")
  }


  /**
   * 重写 非抽象属性和方法
   */
  override val name: String = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}
