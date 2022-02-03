package chapter06

/**
 * @Author mloine
 * @Description
 * @Date 3:31 PM 2022/1/27
 */
object Test07_Inherit {

  def main(args: Array[String]): Unit = {
    val xueyongkang1: Student7 = new Student7("xueyongkang", 18)
    xueyongkang1.printInfo()

    println("-----------------------------------")

    val xueyongkang: Student7 = new Student7("xueyongkang", 18, "you er yuan")
    xueyongkang.printInfo()

    val teacher: Teacher = new Teacher
    teacher.printInfo()


    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    personInfo(xueyongkang1)
    personInfo(xueyongkang)
    personInfo(teacher)

  }

}


//定义·
class Person7() {
  var name: String = _
  var age: Int = _

  println(f"1.父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2.辅助构造起被调用")
    this.name = name
    this.age = age
  }


  def printInfo(): Unit = {
    println(s"Person name $name age $age")
  }
}

class Student7(name: String, age: Int) extends Person7(name, age) {
  var stdNo: String = _

  println("3.子类的主构造起被调用")

  def this(name: String, age: Int, stdNo: String) {
    this(name, age)
    println("4.子类的辅助构造器被调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student name $name age $age stdNo $stdNo")
  }
}


class Teacher extends Person7() {

  override def printInfo() = {
    println("teacher")
  }

}