package chapter07

/**
 * @Author mloine
 * @Description
 * @Date 1:26 PM 2022/2/3
 */
object Test14_HighLevelFunctionMapOp {


  def main(args: Array[String]): Unit = {

    println("=======================过滤============================")

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //1. 过滤
    // 选取偶数
    val evenList = list.filter((item: Int) => {
      item % 2 == 0
    })
    val evenList1 = list.filter(_ % 2 == 1)
    println(evenList)
    println(evenList1)

    println("=========================map==========================")

    //2. map
    // 集合中每个数乘2
    val doubleList = list.map(_ * 2)
    val pfList = list.map(x => x * x)
    println(doubleList)
    println(pfList)

    println("=========================扁平化==========================")

    //3.扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    val flatList2 = nestedList.flatten
    println(flatList2)

    //4. 扁平映射
    println("======================扁平映射=============================")
    // 将一组字符串进行分词 并保存成分词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    val splitStrings: List[Array[String]] = strings.map(string => string.split(" "))
    val flattenList = splitStrings.flatten
    println(flattenList)
    // 一步到位
    println(strings.flatMap(_.split(" ")))

    //5.group 分组操作
    println("======================group 分组操作=============================")
    //  分成奇偶两组
    val groupBy: Map[Int, List[Int]] = list.groupBy(_ % 2)
    println(groupBy)

    list.groupBy(data => {
      if (data % 2 == 0) {
        "偶数"
      } else {
        "奇数"
      }
    }).foreach(tuple2 => println(f"${tuple2._1} max ${tuple2._2.max}"))

    // 给定一组词汇 按照单词的首字母进行分组
    val wordList = List("china", "america", "alice", "canada", "cary", "bob", "japan")
    println(wordList.groupBy(_.charAt(0)))

    //6.
    println("===================================================")
  }


}
