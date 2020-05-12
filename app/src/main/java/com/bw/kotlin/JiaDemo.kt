package com.bw.kotlin

//从1加到100
fun main(args: Array<String>) {
    //区间
    var nums=1..100//声明一个数组,1到100
    var result=0;//result初始值为0
    for (num in nums){
        result=result+num;
    }
    println("${result}")
}