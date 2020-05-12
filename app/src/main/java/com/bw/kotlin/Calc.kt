package com.bw.kotlin

/*
* 简易计算器
* */
//fun固定写法,plus函数名称,(a,第一个参数,类型Int)返回值Int类型
fun main(args:Array<String>){
    var a=8
    var b=2
    println("a+b="+ plus(a,b))
    println("a-b="+ sub(a,b))
    println("a*b="+ mutl(a,b))
    println("a/b="+ devide(a,b))
}
//加法
fun plus(a:Int,b:Int):Int{
    return a+b;
}
//减法
fun sub(a: Int,b: Int):Int{
    return a-b;
}
//乘法
fun mutl(a: Int,b: Int):Int{
    return a*b;
}
//除法
fun devide(a: Int,b: Int):Int{
    return a/b;
}