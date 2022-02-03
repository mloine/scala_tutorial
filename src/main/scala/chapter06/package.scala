/**
 * @Author mloine
 * @Description 包对象
 * @Date 1:17 PM 2022/1/27
 */
package object chapter06 {

  //定义当前包共享的属性和方法
  val commonValue = "mloine"

  def commonMethod(): Unit = {
    println(f"我们在${commonValue}学习")
  }

}
