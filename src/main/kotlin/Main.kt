package ru.netology

fun main(args: Array<String>) {
    val perevod = 100000
    val comission = 0.75
    val minComission = 35
    val amount = (perevod/100)*0.75
    val result =35
    val minPerevod = if(amount < minComission) result else amount

    println(minPerevod)



}
