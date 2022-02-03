package chapter06

/**
 * @Author mloine
 * @Description
 * @Date 2:37 PM 2022/1/27
 */
object Test05_Constructor {

  def main(args: Array[String]): Unit = {

    val student = new Student1
    student.student1()
    println("============================================")
    val student2 = new Student1("薛勇康")
    println("============================================")
    val student3 = new Student1("薛勇康",27)
  }

}

// 定义一个测试类
class Student1() {

  // 定义属性
  var name: String = _

  var age: Int = _

  println("主构造方法被调用")

  def this(name: String) {
    //直接调用主构造器
    this()
    println("辅助构造方法1")

    this.name = name
    println(f"name : ${this.name} age: ${age}")
  }

  def this(name: String, age: Int) {
    this(name)
    println("辅助构造方法2 间接调用")
    this.age = age
    println(f"name : ${this.name} age: ${age}")

  }
  
  def student1(): Unit ={
    println("一般方法被调用")
  }

}
