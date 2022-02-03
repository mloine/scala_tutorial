package chapter07

import scala.collection.mutable

/**
 * @Author mloine
 * @Description
 * @Date 9:33 PM 2022/2/3
 */
object Test16_mergeMap {

  def main(args: Array[String]): Unit = {

    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    println(map1 ++ map2)

    // 以map2作为初始值
    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)(
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      }
    )

    println(map3)
    println(map3.getClass)

  }
}
