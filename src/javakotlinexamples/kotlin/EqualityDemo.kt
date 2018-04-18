package javakotlinexamples.kotlin

fun main(args: Array<String>) {

    val a = "Hallo Campus"
    var b = "" + a

    // structural equality
    println(String.format("a == b: %b", a == b))

    // referential equality
    println(String.format("a === b: %b", a === b))
    b = a
    println(String.format("a === b: %b", a === b))
}