package chapter07

/**
 * @Author mloine
 * @Description 词频统计 scala 单机版 预处理方式
 * @Date 9:44 PM 2022/2/3
 */
object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {

    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // 思路1: 打散成普通版本
    val newStringList = tupleList.map((kv) => {
      (kv._1.trim + " ") * kv._2
    })


    println(newStringList)

    val wordCountList = newStringList
      .flatMap(_.split(" "))
      .groupBy(elem => elem)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)

    println(wordCountList)

    // 思路2 直接基于预统计的结果  Map[String, List[(String, Int)]]
    //    val stringToTuples = tupleList.flatMap(kv => {
    //      kv._1.split(" ").map((_, kv._2))
    //    }).groupBy((kv) => {
    //      kv._1
    //    }).map((kv) => {
    //      (kv._1, kv._2.map(_._2).sum)
    //    }).toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    //
    //    println(stringToTuples)

    //1.将字符串打散为单词 并结合对应的个数 包装成二元祖
    val preCountList: List[(String, Int)] = tupleList.flatMap(
      tuple => {
        val strings: Array[String] = tuple._1.split(" ")
        strings.map((_, tuple._2))
      }
    )

    println(preCountList)

    //2.对二元组 进行单词分组
    val preCountMap: Map[String, List[(String, Int)]] = preCountList.groupBy(_._1)
    println(preCountMap)


    //3. 叠加每个单词 预统计的个数值
    val countMap = preCountMap.mapValues(value => value.map(_._2).sum)
    println(countMap)

    //4.转换成list 排序取前三
    val result = countMap.toList
      //      .sortBy(_._2)(Ordering[Int].reverse)
      .sortWith(_._2 > _._2)
      .take(3)
    println(result)

  }
}
