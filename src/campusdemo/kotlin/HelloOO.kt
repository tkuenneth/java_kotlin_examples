package campusdemo.kotlin

class Greeter(val name: String) {
    fun greet() {
        println("Hallo, $name")
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}