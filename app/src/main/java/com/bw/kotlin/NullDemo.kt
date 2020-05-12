package com.bw.kotlin

//空值处理
//接受的参数为非空的string类型,加上问号?表示传入的参数可以为空
fun heat(str:String?):String{
    return "热"+str
}
fun main(args: Array<String>) {
    var result1= heat("水")
    println(result1)
    var result2=heat(null)
    println(result2)
}