package chapter06

/**
 * @Author mloine
 * @Description 伴生对象模是想 工厂模式 apply
 * @Date 12:27 PM 2022/1/30
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {

    //    val xyk = new Student11("xyk", 18)
    //    xyk.printInfo()

    val xyk = Student11.newStudent("xyk", 26)
    xyk.printInfo()

    val xyk1 = Student11.apply("xyk2", 27)
    xyk1.printInfo()

    // 此处实际调用的是apply方法
    val xyk2 = Student11("xyk2", 27)
    xyk2.printInfo()
  }
}

/**
 * 主构造器 可以私有化
 *
 * @param name
 * @param age
 */
class Student11 private(val name: String, val age: Int) {

  def printInfo(): Unit = {
    println(f"student: $name $age ${Student11.school} ")
  }

}

//伴生对象
object Student11 {

  val school: String = "幼儿园"

  // 通过伴生对象 创建对象 工厂
  def newStudent(name: String, age: Int): Student11 = {
    new Student11(name, age)
  }

  /**
   * 在scala中 调用apply 可以直接省略
   *
   * @param name
   * @param age
   * @return
   */
  def apply(name: String, age: Int): Student11 = new Student11(name, age + 1)

}