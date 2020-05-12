package com.bw.kotlin
//可以在上面直接定义数值,然后再方法中调用
var pi=3
//getRectArea获取长方形面积
fun getRectArea(a:Int,b:Int):Int{
    return a * b
}
//C获取圆的周长
fun C(p:Int= pi, bj:Int):Int{
    return 2*p*bj
}
//V获取圆柱的体积
fun V(p:Int,r:Int,h:Int):Int{
    return p*r*r*h
}
//S获取球体的表面积
fun S(p:Int,r:Int):Int{
    return 4*p*r*r
}

fun main(args: Array<String>) {
    //获取长方形面积
    var cfx= getRectArea(3,2)
    println("长方形的面积是"+cfx)
    //获取圆的周长
    var zc= C(3,5)
    println("圆的周长是"+zc)
    //获取圆柱的体积
    var tj= V(3,5,18)
    println("圆柱的体积是"+tj)
    //获取球体的表面积
    var bmj= S(3,5)
    println("球体的表面积是"+bmj)
}