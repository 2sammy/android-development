package com.example.kotlinbasics

fun main() {
    val fruits = setOf<String>("mangoes","peas","oranges","pineapple","mangoes","oranges")
    val newFruits = fruits.toMutableList()
    newFruits.add("bananas")
    newFruits.add("melons")
    println(fruits.size)
    println(fruits.toSortedSet())
    println(newFruits.elementAt(3))
    //map

    val daysOfWeek = mapOf(1 to "mon", 2 to "tue",3 to "wed")
    print(daysOfWeek[2])
    
}