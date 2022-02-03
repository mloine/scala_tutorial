package chapter08

/**
 * @Author mloine
 * @Description
 * @Date 11:27 PM 2022/2/3
 */
object Test02_MatchTypes {

  def main(args: Array[String]): Unit = {

    //1.匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "Int one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      // 常量匹配 通常需要指定统配符的匹配 避免matchError
      case _ => f"Any ${x}"
    }

    println(describeConst(1))
    println(describeConst("hello"))
    println(describeConst(true))
    println(describeConst('+'))
    println(describeConst(0.3))

    println("=================type====================")

    //2.匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => f"Int ${i}"
      case s: String => f"String ${s}"
      case list: List[String] => f"List ${list}"
      // array 不存在隐式转换
      case array: Array[Int] => f"Array ${array.mkString(",")}"
      case a => f"Something else: ${a} "
    }

    println(describeType(123))
    println(describeType("sadas"))
    println(describeType(List("a", "b")))
    println(describeType(List(1, 2)))
    println(describeType(Array("hi", "hello")))
    println(describeType(Array(1, 2)))

    println("===========================Array=============================")

    //3.匹配数组类型
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 30, 20),
    )) {

      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        //匹配两元素数组
        case Array(x, y) => f"Array: $x , $y"
        case Array(0, _*) => "以0开头的数组"
        case Array(x, 1, z) => "中间为1的三元素数组"
        case _ => "something else"
      }

      println(result)
    }

    println("=======================list= 方式1================================")
    for (arr <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88),
      List("hello", 30, 20),
    )) {

      val result = arr match {
        case List(0) => "0"
        //匹配两元素数组
        case List(x, y) => f"Array: $x , $y"
        case List(0, _*) => "以0开头的数组"
        case List(x, 1, z) => "中间为1的三元素数组"
        case _ => "something else"
      }

      println(result)
    }

    println("=======================list= 方式2================================")
    //    val list = List(1, 2, 5, 7, 24)
    val list = List(24)
    println(list)

    list match {
      case first :: second :: rest => println(s"first ${first} , second ${second} , rest: ${rest}")
      case _ => println("something else")
    }

    println("=======================元组================================")
    //5. 匹配元组

    for (tuple <- List(
      (0, 1),
      (0, 0),
      (0, 1, 0),
      (0, 1, 1),
      (1, 23, 56),
      ("hello", true, 0.5),
    )) {
      val result = tuple match {
        case (a, b) => f"tuple2 a:${a} b:${b}"
        case (0, _) => f"(0,_)"
        case (a, 1, _) => f"(a,1,_) $a"
        case (x, y, z) => f"(x,y,z) $x $y $z"
        case _ => "something else"
      }
      println(result)
    }



  }

}
