package com.zz.scala

import java.text.MessageFormat

import scala.util.control.Breaks._

/**
  * Created by alex.zhang on 16/3/13.
  */
object
Test {

  def main(args: Array[String]) {

    //    a()
    //
    //    println(abc(5))
    //
    //    println(fac(5))
    //
    //    println(decor(right = "{", str = "zz", left = "}"))
    //
    //    println(sum(1,2,3,4,5))
    //
    //    println(sum((1 to 9) :_*))
    //
    //    println(recursiveSum(1 to 5 :_*))
    //
    //    val str = MessageFormat.format("The answer to {0} is {1}","everything", 42.asInstanceOf[AnyRef] )
    //
    //    println(str)


    lazy val worlds = scala.io.Source.fromFile("/usr/local/test").mkString



    //println(worlds)

    exceptionTest()


  }

  def a() = for (i <- 1 to 9; j <- 1 to i) {

    printf("%d*%d=%d\t", j, i, j * i)
    if (i == j)
      println()
  }

  def abc(n: Double) = {
    var t = n;
    for (i <- 1 to 5) yield n * i
  }

  def sum(args: Int*) = {
    var n = 0
    for (i <- args) n += i
    n
  }

  def recursiveSum(args: Int*): Int = {
    if (args.length == 0) 0
    else
      args.head + recursiveSum(args.tail: _*)
  }

  def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

  def decor(str: String, right: String = "[", left: String = "]") = right + str + left

  def exceptionTest(): Unit = {

    try {
      val a = 10 / 0
      println(a)
    } catch {
      //case _ : ArithmeticException => println("除数不能为零!")
      case ex: ArithmeticException => println(ex.toString)
    }

  }

}
