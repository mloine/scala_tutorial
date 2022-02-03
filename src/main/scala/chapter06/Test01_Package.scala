
//使用嵌套风格
package com {

  import com.mloine.scala.Inner

  //外层包中 定义单例对象
  object Outer {
    var out: String = "out"
    println("this is outer create")

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }

  package mloine {

    package scala {

      object Inner {
        val in: String = "In"

        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }

      }

    }

  }

}


//在同一文件中定义多个包
package aaa {
  package bbb {

    import com.mloine.scala.Inner

    object Test01_Package {
      def main(args: Array[String]): Unit = {
        println(Inner.in)
      }
    }
  }

}


package chapter06 {
  object t {
    def main(args: Array[String]): Unit = {
      commonMethod()
    }
  }
}


package ccc {
  package ddd {
    object Test02_31232 {
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }
  }

  //定义包对象
  package object ddd {
    val school: String = "mloine_school"
  }
}

