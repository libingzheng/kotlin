package com.bw.kotlin

fun main(args: Array<String>) {
    var lists= listOf("买鸡蛋","买大米","买买买");
    //withIndex下标位置
    for ((i,e) in lists.withIndex()){
        println("$i,$e")
    }
}