package com.bw.kotlin

//颜值判断器
fun checkFace(score:Int){
    //在上面写好条件,然后根据添加输出不同的数据
    if (score>80){
        println("这是一个帅哥")
    }else{
        println("这是一个衰哥")
    }
}
fun main(args:Array<String>){
    var face=90;
    checkFace(face)
}