package chapter06

object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student1 = new Student14
    student1.study()
    student1.increase()

    student1.play()
    student1.increase()

    student1.dating()
    student1.increase()

    // 动态混入
    println("===============================================")

    val studentWithTalent = new Student14 with Talent {
      override def singing(): Unit = println(f"$name singing")

      override def dancing(): Unit = println(f"$name dancing")
    }
    studentWithTalent.dating()
    studentWithTalent.singing()

    studentWithTalent.dancing()
  }

}

trait Talent {

  def singing(): Unit

  def dancing(): Unit

}

// 定义一个特质
trait Knowledge {

  var amount: Int = 0

  def increase(): Unit

}


class Student14 extends Person13 with Young with Knowledge {

  // 重写冲突的属性
  override val name: String = "student"

  //实现抽象发发
  override def dating(): Unit = {
    println(s"student $name is dating")

  }

  //=
  def study(): Unit = {
    println(s"student $name is studying")
  }

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name ")
  }

  // 实现特质中的抽象方法
  override def increase(): Unit = {
    amount += 1
    println(f"$name knowledge: $amount")
  }
}