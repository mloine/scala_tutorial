package chapter06

/**
 * @Author mloine
 * @Description
 * @Date 2:51 PM 2022/1/27
 */
object Test06_ConstructorParam {

  def main(args: Array[String]): Unit = {
    val stuent2 = new Student2
    stuent2.name = "alice"
    stuent2.age = 18
    println(f"student2 name:${stuent2.name} age:${stuent2.age}")

    val student3 = new Student3("xueyongkang", 18)
    println(f"student3 name:${student3.name} age:${student3.age}")

    val student4 = new Student4("xueyongjian", 18)
    student4.printInfo()

    val student5 = new Student5("xueyongkang", 18)
    println(f"student5 name:${student5.name} age:${student5.age}")

    val student6 = new Student6("xueyongkang", 18,"幼儿园")
    println(f"student6 name:${student6.name} age:${student6.age}")
    student6.printInfo()

  }

}

//定义类
//无参构造器
class Student2 {
  //单独定义属性
  var name: String = _

  var age: Int = _
}

//上定义等
class Student3(var name: String, var age: Int) {

}

class Student4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(f"student4 name:${name} age:${age}")

  }
}


//// 不推荐
//class Student44(_name: String, _age: Int) {
//
//  var name:String = _name
//  var age:Int = _age
//
//}


//上定义等
class Student5(val name: String, var age: Int) {

}



class Student6(var name: String, var age: Int){

    var school:String = _

    def this(name:String,age:Int,school:String){
      this(name,age)
      this.school = school
    }

  def printInfo(): Unit = {
    println(f"student6 name:${this.name} age:${this.age} school:${this.school}")

  }
}


