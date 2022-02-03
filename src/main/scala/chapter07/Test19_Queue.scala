package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @Author mloine
 * @Description
 * @Date 10:42 PM 2022/2/3
 */
object Test19_Queue {


  def main(args: Array[String]): Unit = {

    //1. 创建一个可变的队列
    val queue = new mutable.Queue[String]()

    // 入队
    queue.enqueue("a", "b", "c")
    queue.enqueue("B")

    println(queue)

    //出队
    val str = queue.dequeue()
    println(str)
    println(queue)

    val str1 = queue.dequeue()
    println(str1)
    println(queue)

    queue.enqueue("d", "e")
    println(queue)

    println(queue.dequeue())
    println(queue)

    println("================================")
    //2. 不可变队列
    val queue2: Queue[String] = Queue[String]("a", "b", "c")

    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)

  }

}
