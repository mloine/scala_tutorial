package chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * @Author mloine
 * @Description
 * @Date 10:50 PM 2022/2/3
 */
object Test20_Parallel {

  def main(args: Array[String]): Unit = {

    val result: immutable.IndexedSeq[String] = (1 to 100).map(
      x => Thread.currentThread().getName
    )

    println(result)

    // par 要做并行计算 的方式
    val result2: ParSeq[String] = (1 to 100).par.map(
      x => Thread.currentThread().getName
    )

    println(result2)

  }
}
