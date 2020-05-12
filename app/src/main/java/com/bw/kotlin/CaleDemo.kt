package com.bw.kotlin
/*
* 实现控制台输入数字实现简单的计算机效果
* */
fun main(args: Array<String>) {
    println("请输入第一个数字")
    //读取到输入的字符串
    var num1str= readLine()
    println("请输入第二个数字")
    var num2str= readLine()
    //!!确保输入的数据一定不为空
    var num1=num1str!!.toInt()
    var num2=num2str!!.toInt()
    println("${num1}+${num2}=${num1+num2}")
}