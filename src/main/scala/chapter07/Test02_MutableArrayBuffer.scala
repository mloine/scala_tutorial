package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @Author mloine
 * @Description 原则 不可变集合 使用符号处理
 *              可变集合 使用其他方法
 * @Date 1:22 PM 2022/1/31
 */
object Test02_MutableArrayBuffer {

  def main(args: Array[String]): Unit = {

    //1.可变数组的 创建 默认大小16
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int](5)

    val arr2 = ArrayBuffer[Int](23, 57, 92)

    println(arr1.mkString(","))
    println(arr2.toString())

    // error 注意下标越界问题
    //    println(arr1(0))
    arr2(1) = 39
    println(arr2(1))


    //3.添加元素
    println("========================================")
    val arr11 = arr1 :+ 15
    println(arr1)
    println(arr11)
    println(arr11 == arr1)

    arr1 += 19
    val newArray2 = arr1 += 20
    arr1 += 21

    //往前追加 数字
    18 +=: arr1

    println(arr1)
    println(newArray2)

    //推荐使用方法添加
    arr1.append(36)
    arr1.prepend(11, 76)
    arr1.insert(1, 2)

    println(arr1)
    println(newArray2)

    println("=======================")
    println(arr2)
    arr1.insertAll(2, arr2)
    arr1.appendAll(arr2)
    println(arr1)
    println(newArray2)


    //4.删除元
    arr1.remove(3)
    println(arr1)

    arr1.remove(0, 5)
    println(arr1)

    arr1.append(92)
    println(arr1)
    // 删除一个匹配的元素
    arr1 -= 92
    println(arr1)

    println("-=========================")

    //5. 可变数组转换成 不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(25, 56, 98)
    // 不可变数组的转换
    val newArr:Array[Int] = arr.toArray

    println(newArr.mkString(","))
    println(arr)

    //6.不可变数组转换成可变数组
    val buffer:mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)

  }
}


