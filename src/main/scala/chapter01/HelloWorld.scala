package chapter01

/**
 * @Author mloine
 * @Description
 * object:关键字 声明一个单例对象(伴生对象)
 * @Date 3:51 PM 2022/1/8
 */
object HelloWorld {

  /**
   * main 方法:从外部可以直接调用执行的
   *
   * def 方法名称(参数名:参数类型): 返回类型 = { 方法体 }
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("hello scala from java")
  }

}