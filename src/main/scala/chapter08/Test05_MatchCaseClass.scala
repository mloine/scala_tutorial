package chapter08

/**
 * @Author mloine
 * @Description case class 样例类:默认实现伴生对象的apply和 unapply
 * @Date 1:02 AM 2022/2/4
 */
object Test05_MatchCaseClass {

  def main(args: Array[String]): Unit = {
    val student: Student1 = new Student1("alice", 18)
    //针对对象实例内容进行匹配

    val result = student match {
      case Student1("alice", 18) => "Alice 18"
      case _ => "something else"
    }

    println(result)
  }

}

//样例类
case class Student1(name: String, age: Int)
