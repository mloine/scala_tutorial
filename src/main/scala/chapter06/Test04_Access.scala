package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    //person.name protect 只能在类或子类中访问
    println(person.sex)
    println(person.age)
    person.printInfo()


    val worker = new Worker
    worker.age = 16
    println(worker.age)

    worker.printInfo()
  }
}


class Worker extends Person {

  
  // 重写需要 使用override
  override def printInfo(): Unit = {
    name = "bob-worker"
    age = 25
    sex = "male"

    println(f"Worker: $name $age $sex")
  }

}




