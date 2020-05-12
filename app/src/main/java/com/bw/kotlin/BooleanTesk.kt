package com.bw.kotlin

//Boolean 布尔  true为真  false为假
fun main(args:Array<String>){
    //比大小
    var num1=4
    var num2=6
    println(num1>num2)

    //比根号大小
    //Math数学,sqrt接收一个数字,5.0就是根号5
    var num3=Math.sqrt(5.0)-Math.sqrt(4.0)
    var num4=Math.sqrt(4.0)-Math.sqrt(3.0)
    println(num3<num4)
    //打印具体值
    println(num3)
    println(num4)

    //2的100次方和3的75次方
    var num5=Math.pow(2.0,100.0)//2的100次方
    var num6=Math.pow(3.0,75.0)//3的75次方
    println(num5>num6)
    println(num5)
    println(num6)
}