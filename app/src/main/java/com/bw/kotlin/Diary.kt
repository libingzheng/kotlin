package com.bw.kotlin

//日记生成器,接收参数是地点返回值是日记的内容
fun diary(placeName:String):String{
    //${placeName}字符串模板,${placeName.length}获取前几个字的个数
    var temple="""去${placeName}${placeName.length}个字"""
    return temple
}
fun main(args:Array<String>){
    var riji= diary("学校")
    println(riji)
}