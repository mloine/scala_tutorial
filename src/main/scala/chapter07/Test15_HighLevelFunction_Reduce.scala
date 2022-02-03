package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 2:10 PM 2022/2/3
 */
object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)

    //1. reduce
    println("==============reduce =================")
    val reduceResult = list.reduce((a, b) => {
      a + b
    })
    println(reduceResult)
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))

    println("===============================")
    val list2 = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    println(list2.reduceRight(_ - _))

    //2. fold
    println("==============fold 折叠=================")
    // 第一个参数是初始值
    println(list.fold(10)(_ + _)) // 10 + 1 + 2 + 3 + 4
    println(list.fold(10)(_ - _)) //10 -1 -2 -3 -4
    println(list.foldLeft(10)(_ - _)) //10 -1 -2 -3 -4
    println(list2.foldRight(11)(_ - _)) // 3 - （4 -（5 -（8 -（10 -11））））

  }
}
