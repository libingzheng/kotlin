package com.bw.kotlin

//kotlin的when表达式
//10分满分 9分干得不错 8分还可以 7分还需努力 6分刚好及格 其他(还需要努力)

fun student(score:Int){
    when(score){
        10 -> println("满分")
        9 -> println("干得不错")
        8 -> println("还可以")
        7 -> println("还需要努力")
        6 -> println("刚好及格")
        else -> println("还需努力")
    }
}
fun main(args: Array<String>) {
    student(8)
}
//kotlin的when方法和Java的switch差不多  但是比switch更加强大,方便