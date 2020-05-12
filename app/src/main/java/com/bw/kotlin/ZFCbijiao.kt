package com.bw.kotlin

//比较两个字符串
fun main(args:Array<String>){
    //一个等号是赋值
    var str1="Andy"
    var str2="andy"
    //两个等号是判断两个字符串是否相等
    println(str1==str2)
    //equals也是比较字符串
    println(str1.equals(str2))
    //后面加一个true意思是忽略字母的大小写
    println(str1.equals(str2,true))
    //后面加一个false意思是不忽略字母的大小写
    println(str1.equals(str2,false))
}