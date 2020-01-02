package javakotlinexamples.kotlin

class ConstructorDemo(name: String) {
    val first = "First property: $name".also(::println)

    init {
        println("First block: ${name}")
    }

    val second = "Second property: ${name.toUpperCase()}".also(::println)

    init {
        println("Second block can access $second")
    }

    constructor() : this("Hallo") {
        println("secondary construcotr called")
    }
}