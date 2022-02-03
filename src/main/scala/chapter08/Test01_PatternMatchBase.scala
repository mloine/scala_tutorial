package chapter08

/**
 * @Author mloine
 * @Description 模式匹配 基本语法
 * @Date 11:12 PM 2022/2/3
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {

    //1. 基本语法
    val x: Int = 5
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case _ => "other"
    }

    println(y)

    //2. 示例 用模式匹配 实现2元运算
    val a = 25
    val b = 13

    def matchDualOp(op: Char) = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => -1
    }

    println(matchDualOp('+'))
    println(matchDualOp('-'))
    println(matchDualOp('*'))
    println(matchDualOp('/'))
    println(matchDualOp('\\'))


    println("==================")

    //3.模式守卫
    //求整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(1))
    println(abs(-1))

  }
}
