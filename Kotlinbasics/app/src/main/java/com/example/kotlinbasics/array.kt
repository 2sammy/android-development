package com.example.kotlinbasics

fun main(){
    val marks = arrayOf(23,45,67,89,90)
    val numbers = arrayOf(1,2,3,4,5)
    val numbersD : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0)
    val days = arrayOf("mon","tue","wen","thur")
    val fruits = arrayOf(Fruit("apple",20.0), Fruit("orange",30.2), Fruit("passion",35.0))
    numbers[0]=7
    numbers[3]=9
    for(element in numbers){
        print(element)
    }
    for(fruit in fruits){
        println("${fruit.name}")
        println("${fruit.price}")
    }
    for (index in fruits.indices){
        println("${fruits[index].name} is in index  $index")
    }
    println(" my values are ${numbersD.contentToString()}")
    println("days of the week are ${days.contentToString()}")
    println("someones marks are ${marks.contentToString()}")
    println("my favourite fruits are ${fruits.contentToString()}")
}


data class Fruit(val name: String,val price:Double)