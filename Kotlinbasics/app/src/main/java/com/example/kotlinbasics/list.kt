package com.example.kotlinbasics
fun main (){
    val months = listOf ("jan", "feb","march","june")
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("sept","oct","nov","dec")

    val days = mutableListOf<String>("thur","fri","sat","sunday")
    val removeList = mutableListOf<String>("mon","tues")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("aug")
    print(months[2])
    days.add("tue")
    days[3]= "mon"
    days.removeAt(1)
    days.removeAll(days)
    print(days)


}