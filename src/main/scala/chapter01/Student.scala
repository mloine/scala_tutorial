package chapter01

/**
 * @Author mloine
 * @Description
 * @Date 4:15 PM 2022/1/8
 */
class Student(var name: String, var age: Int) {

  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }

}

//引入伴生对象
object Student {

  val school: String = "哈士奇幼儿园"


  def main(args: Array[String]): Unit = {
    val alise = new Student("alise", 20)
    val bob = new Student("bob", 23)

    alise.printInfo()
    bob.printInfo()
  }

}
