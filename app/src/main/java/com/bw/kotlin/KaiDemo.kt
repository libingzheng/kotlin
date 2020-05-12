package com.bw.kotlin

fun main(args: Array<String>) {
    var num1=1 until 100//[前闭,后开)区间
//    for (num in num1){
//        println(num)
//    }
    var num2=1 .. 16
    //stpe步长
//    for (a in num2 step 2){
//        println(a)
//    }
    //reversed倒序
    var num3=num2.reversed()
    for (a in num3){
        println(a)
    }
    //count数量
    println("总数为"+num3.count())
}