package com.example.kotlinbasics
fun main() {
    val firstName = "mike"
    var name = "sammy"
    name = "manoah"
    var result = 4 + 3
    result /= 2
    result *= 2
    // println(result)
    var mynumber = 5
    val float = 23.4F
    val double = 23.323
    var isBeatiful = true
    var myString = "youre here"
    var letter = myString[2]
    var lastString = myString[myString.length - 1]
    var myLength = myString.length
    //print("first character $letter and the length of myString is ${myString.length}")

    // arithmetic
    var resul = 4 + 4
    resul -= 2
    resul /= 2
    resul %= 3
    resul *= 2
    print(resul)
    val m = 4

    //int is 32
    //byt
    mynumber += 3
    //print("$mynumber")
    val sam1 = 100
    val sam2 = 56
    if (sam1 > sam2) {
        println("he is cool")
    } else if (sam1 == sam2) {
        println("he is smart")
    } else {
        println("i need more time")
    }

    var season = 3
    when (season) {
        1 -> println("summer")
        2 -> println("autum")
        3 -> println("spring")
        4 -> {
            println("rain")
            println("fall")
        }
        else -> print("spring")
    }
    var month = 3
    when (month){
      in  3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9..11 -> println("fall")
        12,2,1 -> println("winter")
        else -> println("invalid season")


    }
    var age = 17
    when(age){
        in 21..150 -> println("now you are cool")
        in 18..20 -> println("get so")
    }
    //comparison operations
    val sam = 2>4
    print("sam is + $sam")
     val zalo = 21 != 22
    println("zalo age is + $zalo")
    println("ten is less than three ${10<3}")
    println("20 is less than 10 ${20<10}")
    //assignment comparison
    var mynumb = 4
    mynumb+=4
    println(mynumb)
    //increment and decrement

   println("mynumb ${mynumb++}")
    println("mynumb ${++mynumb}")
println("mynumb is ${--mynumb}")
    //if statement
    var heightPerson1 = 170
    var heightPerson2 = 189
    if (heightPerson1 > heightPerson2){
        println("use brain to fight")}
        else if (heightPerson1 < heightPerson2){
            println("use take it style")}
            else{
                println("use your own")
            }
    var period = 2
    when(period){
        1 -> println("rainy")
        2 -> println("windy")
        3 -> println("sunny")
        4 -> {
            println("calm")
            println("hot")
        }
        
    }
    var mean = 100
    }

