package com.example.collage

// Объявление классов

val car: String = "Mercedes" // Не изменяямая
var dog: Long = 1L // Изменякмый - var, Не изменяемый - val

fun total(a: Int, b: Int): String{
    val res = a+b
    return res.toString()
}

// Если в одну строчку

fun totalE(a: Int, b: Int): String = (a+b).toString()

fun total2(a: Int, b: Int): String{
    return (2).toString()
}

open class Animal  // Чтобы имплементить класс его нужно пометить как опен
interface Click {
    fun click()
}


enum class Animals{
    CAT,
    DOG
}

fun main(args: Array<String>) {
    var test: Test? = null

    // test!! - два восклецательных говорят не нал в любов случае вызови
    // test?.
}

class Test: Animal, Click{

    private var age: String? = null

    constructor(age: String){
        this.age = age

    }
    constructor() {

    }

    fun total(a: Int){
        if (a == 0) {
            println()
        }
        else{
            println("Sosi")
        }
    }
    fun total2(a: Animals) {
        val test: Animals = Animals.CAT

        when(test) {
            Animals.CAT -> println("Мяу")

        }
    }

    override fun click() {
        TODO("Not yet implemented")
    }

}

