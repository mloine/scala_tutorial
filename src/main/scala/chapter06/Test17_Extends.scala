package chapter06

object Test17_Extends {

  def main(args: Array[String]): Unit = {
    val alice = new Student17("alice", 18)
    alice.sayHi()
    alice.study()

    val person: Person17 = new Student17("alice", 18)
    person.sayHi()


    println(f"student is Student17: ${alice.isInstanceOf[Student17]}")
    println(f"student is Person17: ${alice.isInstanceOf[Person17]}")
    println(f"person is Person17: ${person.isInstanceOf[Person17]}")
    println(f"person is Student17: ${person.isInstanceOf[Student17]}")


    val person2: Person17 = new Person17("kli", 35)
    println(f"person2 is Person17: ${person2.isInstanceOf[Person17]}")
    println(f"person2 is Student17: ${person2.isInstanceOf[Student17]}")

    // 转换
    if (person.isInstanceOf[Student17]) {
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }

    println(classOf[Student17])


    //枚举类
    println(WorkDay.MONDAY)
    println(WorkDay.MONDAY.id)

    //应用类
  }
}

class Person17(val name: String, val age: Int) {
  def sayHi(): Unit = {
    println(f"hi from person $name")
  }
}


class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHi(): Unit = {
    println(f"hi from student $name")
  }

  def study(): Unit = {
    println(f"${name} studying")
  }

}

// 定义枚举类对象
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

// 定义应用类
object TestApp extends App {
  println("这是一个应用类 app start")

  type MyString = String

  val a: MyString = "abc"

  println(a)
}

