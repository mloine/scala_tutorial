package chapter04

object Test03_FunctionParamter {


  def main(args: Array[String]): Unit = {

    //1.可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("alice")
    f1("alice", "aaaa", "bbb")


    //2.多个参数 的情况下 可变参数放在最后
    def f2(str1: String, str2: String*): Unit = {
      //      println(str1,str2)
      println(f"str1:$str1,str2:$str2")
    }

    f2("xueyongkang", "aaa", "bbbb", "cccc")
    f2("xueyongkang")

    //3.参数的默认值
    def f3(name: String = "xue yong kang"): Unit = {
      println(f"my name is $name")
    }

    f3()
    f3("xue yong jian")

    //4.代名参数
    def f4(name: String = "xyk", age: Int): Unit = {
      println(f"${age}岁的${name}在卷")
    }

    f4("mloine", 18)
    f4(age = 27, name = "薛勇康")
    f4(age = 21)

    
  }
}
