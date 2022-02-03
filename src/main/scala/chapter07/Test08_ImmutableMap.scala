package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 8:38 PM 2022/2/2
 */
object Test08_ImmutableMap {

  def main(args: Array[String]): Unit = {

    //1.创建map
    val map1: Map[String, Int] = Map[String, Int]("a" -> 1, "b" -> 2, "hello" -> 25)
    println(map1)
    println(map1.getClass)

    println(map1("a"))

    println("=================================================")
    //2.遍历元素
    map1.foreach(println(_))
    println("=================================================")

    map1.foreach((kv: (String, Int)) => {
      println(kv)
    })

    println("===================================================")

    //3.取map中所有的key 或者 values
    for (key <- map1.keys) {
      println(s"$key ---> ${map1.get(key)}")
      //      println(s"$key ---> ${map1(key)}")
    }
    println(map1.get("a").get)
    println(map1.get("c"))

    //  推荐取值方式
    println(map1.getOrElse("c", 0))


    //
    println(map1("a")) 
  }
}
