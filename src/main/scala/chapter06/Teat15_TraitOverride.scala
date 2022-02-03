package chapter06

/**
 * @Author mloine
 * @Description
 * @Date 2:32 PM 2022/1/30
 */
object Teat15_TraitOverride {
  def main(args: Array[String]): Unit = {
    val student1 = new Student15
    student1.increase()
  }
}


trait Talent15 {

  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("Talent15 increase")

  }

}

// 定义一个特质
trait Knowledge15 {

  var amount: Int = 0

  def increase(): Unit = {
    println("Knowledge15 increase")
  }

}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def singing(): Unit = println("singing")

  override def dancing(): Unit = println("dancing")

  override def increase(): Unit = super.increase()
}
