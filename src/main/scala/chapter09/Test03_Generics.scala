package chapter09

/**
 * @Author mloine
 * @Description fan型
 * @Date 2:29 AM 2022/2/4
 */
object Test03_Generics {

  def main(args: Array[String]): Unit = {

    //1.协变和逆变
    val child: Parent = new Child

    //    val childList:MyCollection[Parent] = new MyCollection[Child]// +E 协变
    val childList: MyCollection[SubChild] = new MyCollection[Child] // -E 逆变


    // 测试上下限
    def test[A <: Child](a: A): Unit = println(a.getClass.getName)

    test[Child](new Child)
    test[Child](new SubChild)

    println("=================")
    test[SubChild](new SubChild)
    //    test[SubChild](new Child)

  }


}

class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

class MyCollection[-E] {}


// 泛性
class MyCollection1[-E] {}