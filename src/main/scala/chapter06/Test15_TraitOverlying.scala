package chapter06

/**
 * @Author mloine
 * @Description
 * @Date 2:57 PM 2022/1/30
 */
object Test15_TraitOverlying {

  def main(args: Array[String]): Unit = {

    // 钻石问题
    val ball = new MyFootBall
    println(ball.describe())
  }
}

// 球类特征
trait Ball {
  def describe(): String = "ball"
}

// 颜色特征
trait ColorBall extends Ball {

  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()

}

// 种类特征
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

// 定义一个自定义的球类
class MyFootBall extends CategoryBall with ColorBall {

  override def describe(): String = {
    // 可以指定具体的特征或父类
    //    "my ball is a " + super[CategoryBall].describe()
    "my ball is a " + super.describe()
  }
}
