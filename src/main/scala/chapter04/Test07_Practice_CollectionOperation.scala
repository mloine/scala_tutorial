package chapter04
/**
 * @Author mloine
 * @Description 
 * @Date 11:55 PM 2022/1/24
 */
object Test07_Practice_CollectionOperation {

  def main(args: Array[String]): Unit = {
    // 对数据进行处理 将操作抽象出来
    val arr: Array[Int] = Array(12, 45, 75, 98)

    def arrayOperation(arr: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- arr) yield op(elem)
    }


    //
//   for(item <- arrayOperation(arr,_+1)) println(item)

    def addOne(elem:Int):Int = {
      elem + 1
    }

    //调用函数
    val newArray:Array[Int] = arrayOperation(arr,addOne _)

    println(newArray.mkString(","))

    //传入匿名函数 实现数组中元素翻倍
    val newArray2:Array[Int] = arrayOperation(arr,_*2)
    println(newArray2.mkString(","))


    val f1 = (a:Int,b:String,c:Char) => {
      !(a == 0 & b == "" & c == '0')
    }
    println(f1(0,"",'0'))
    println(f1(0,"",'1'))
    println(f1(1,"",'1'))
  }
}
