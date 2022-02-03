package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 11:52 AM 2022/2/1
 */
object Test04_List {

  def main(args: Array[String]): Unit = {

    // 1.创建list
    val list1 = List(23, 65, 87)
    println(list1)

    // 2.访问元素 和遍历元素
    list1(1)
    println(list1(1))
    // 不能更改值
    //    list1(1) = 65

    list1.foreach(println(_))


    val list2 = list1 :+ 88

    list2.foreach(println(_))

    //3. 列表里面添加元素
    val list3 = 10 +: list1
    val list4 = list1 :+ 20

    println(list3)
    println(list4)

    println("==================================================")

    val list5 = list2.::(51)
    println(list2)
    println(list5)

    val list66 = Nil.::(13)
    println(list66)

    // 创建列表的方法
    val list6 = 73 :: 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil

    println(list6)
    println(list7)


    val list8 = list6 :: list7
    println(list8)
    /**
     * 合并列表
     */
    //拆分之后合成list 的扁平化过程
    val list9 = list6 ::: list7
    println(list9)

    val list10 = list6 ++ list7
    println(list10)
  }
}
