package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student1 = new Student13
    student1.sayHello()
    student1.study()
    student1.dating()
    student1.play()


  }
}

// 定义fulei
class Person13 {
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit = {
    println(f"hello from: $name")
  }

  def increase():Unit = println("person increase")
}

// 定义特质
trait Young {

  //非 抽象
  var age: Int
  val name: String = "young"

  //抽象
  def play(): Unit = {
    println(f"young people $name play")
  }

  def dating():Unit

}

class Student13 extends Person13 with Young {

  // 重写冲突的属性
  override val name: String = "student"

  //实现抽象发发
  override def dating(): Unit = {
    println(s"student $name is dating")

  }

  //=
  def study():Unit = {
    println(s"student $name is studing")
  }

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name ")
  }
}

