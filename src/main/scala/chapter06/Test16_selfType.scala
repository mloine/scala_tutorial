package chapter06

/**
 * @Author mloine
 * @Description
 * @Date 9:54 PM 2022/1/30
 */
object Test16_selfType {

  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("xue yong kang", "123456")

    user.insert()
  }

}

// 用户类
class User(val name: String, val password: String)

trait UserDao {

  // 自身类型 定义成了user
  _: User =>

  //注册用户 向数据库插入数据
  def insert(): Unit = println(f"insert into db :${this.name} , ${this.password}")

}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao {

}

