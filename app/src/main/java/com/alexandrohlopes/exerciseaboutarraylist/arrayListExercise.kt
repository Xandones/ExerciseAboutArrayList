package com.alexandrohlopes.exerciseaboutarraylist

fun main(args : Array<String>) { // Without the 'args' in the main function Kotlin will show an error
    val numbers = arrayListOf<Double>(0.0, 2.0, 4.0, 6.0, 8.0)
    var average = 0.0

    for (number in numbers) {
        average += number
    }
    average /= 5
    println("The average of the values inside the ArrayList $numbers is $average")
}