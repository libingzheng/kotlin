package com.bw.kotlin

import java.util.TreeMap

fun main(args: Array<String>) {
    //map通过前面定义的方法名,拿到后面对应的值
    var map= TreeMap<String,String>()
    map["好"]="good"
    map["学习"]="study"
    map["向上"]="up"
    map["天"]="day"
    println(map["好"])
    println(map["好"])
    println(map["学习"])
    println(map["天"])
    println(map["天"])
    println(map["向上"])
}