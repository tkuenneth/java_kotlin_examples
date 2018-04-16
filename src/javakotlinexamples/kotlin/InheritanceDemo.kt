package javakotlinexamples.kotlin

fun main(args: Array<String>) {
    A()
    B()
}

open class A constructor() {

    init {
        println("A")
    }
}

class B constructor() : A() {

    init {
        println("B")
    }
}