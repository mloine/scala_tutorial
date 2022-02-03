package chapter06

/**
 * @Author mloine
 * @Description scala 中多台表现 属性和方法都是动态绑定的
 * @Date 12:21 AM 2022/1/29
 */
object Test08_DynamicBind {

  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    println(student.name)
    student.hello()
  }
}

class Person8 {
  val name: String = "person"

  def hello(): Unit = {
    println("hello person")
  }

}

class Student8 extends Person8 {
  // scala 中属性
  override val name: String = "student"


  override def hello(): Unit = {
    println("hello student")
  }
}
