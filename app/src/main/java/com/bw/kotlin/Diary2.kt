package com.bw.kotlin
//把地名长度的数字转化为汉字
fun diary2(placeName:String){
    //在numberToChinese中把每个数字转换输出为汉字,然后再调用numberToChinese方法输出
    var riji="""去${placeName}${numberToChinese(placeName.length)}个字"""
    println(riji)
}
fun numberToChinese(num:Int):String{
    var result=when(num){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        6 -> "六"
        7 -> "七"
        8 -> "八"
        9 -> "九"
        //如果字符串太长,通过num.toString()可以直接输出数字不转化汉字
        else -> num.toString()
    }
    return result
}
fun main(args: Array<String>) {
    diary2("的口岸维克多挖来判断狼外婆达瓦大打的挖的挖")
}