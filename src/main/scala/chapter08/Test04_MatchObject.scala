package chapter08

/**
 * @Author mloine
 * @Description 匹配对象的内容 需要实现 unapply 拆解
 * @Date 12:50 AM 2022/2/4
 */
object Test04_MatchObject {

  def main(args: Array[String]): Unit = {
    val student: Student = new Student("alice", 18)
    //针对对象实例内容进行匹配

    val result = student match {
      case Student("alice", 18) => "Alice 18"
      case _ => "something else"
    }

    println(result)
  }


}

//定义类
class Student(val name: String, val age: Int)


//定义伴生对象
object Student {

  def apply(name: String, age: Int): Student = {
    new Student(name, age)
  }

  //必须实现一个unapply 用来对对象属性进行拆解
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) {
      None
    } else {
      Some((student.name, student.age))
    }

  }

}
