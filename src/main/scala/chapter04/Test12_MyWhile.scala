package chapter04

object Test12_MyWhile {

  def main(args: Array[String]): Unit = {
    var n = 10

    //1.常规的while循环
    while (n >= 1) {
      println(n)
      n -= 1
    }


    //2.自定义函数实现while关键字,递归调用
    //    def myWhile(condition: =>Boolean)(pb: => Unit){
    //
    //    }


    def myWhile(condition: => Boolean): (=> Unit) => Unit = {

      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }

      doLoop _
    }

    n = 10
    myWhile({
      n >= 1
    })({
      println(n)
      n -= 1
    })


    //匿名函数实现
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {

      op => {
        if (condition) {
          op
          myWhile2(condition)(op)
        }
      }

    }

    n = 10
    myWhile2({
      n >= 1
    })({
      println(n)
      n -= 1
    })



    def myWhile3(condition: =>Boolean)(op: =>Unit): Unit ={
      if(condition){
        op
        myWhile3(condition)(op)
      }
    }

    n = 20
    myWhile2({
      n >= 1
    })({
      println(n)
      n -= 1
    })

  }

}
