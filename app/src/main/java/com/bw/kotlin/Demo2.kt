package com.bw.kotlin

//返回两个数中较大的那个
fun retureBig(a:Int,b:Int):Int{
    if (a>b){
        return a
    }else{
        return b
    }
}
fun main(args:Array<String>){
    var a=8;
    var b=5;
    println("${a},${b}和较大的数为${retureBig(a,b)}")
}