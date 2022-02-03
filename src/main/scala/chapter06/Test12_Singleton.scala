package chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    println(student1)
    println(student2)


  }
}


class Student12 private(val name: String, val age: Int) {

  def printInfo(): Unit = {
    println(f"student: $name $age ${Student11.school} ")
  }

}

// 饿汉
//object Student12 {
//
//  private val tmp: Student12 = new Student12("alice", 18)
//
//  def getInstance(): Student12 = tmp
//
//}

// 懒汉
object Student12 {

  private var tmp: Student12 = _

  def getInstance(): Student12 = {

    if (tmp == null) {
      //没有对象实例的化 就创建一个
      tmp = new Student12("alice", 18)
    }

    tmp

  }
}