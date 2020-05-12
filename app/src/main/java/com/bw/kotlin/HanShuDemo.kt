package com.bw.kotlin

fun main(args: Array<String>) {
    var result=add(3,5);
    println(result)
    //{x:Int,y:Int->x+y}函数表达式
    var i={x:Int,y:Int->x+y}
    var num=i(3,5)
    println(num)
    //函数的第二种写法
    var j:(Int,Int)->Int={x,y->x+y}
    var num2=j(3,5)
    println(num2)
}
fun add(x:Int,y:Int):Int{
    return x+y;
}