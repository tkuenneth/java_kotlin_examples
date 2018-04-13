package javakotlinexamples.kotlin

fun main(args: Array<String>) {

    val a: Float = 123.45f
    val b: Double = 123.45
    val c: Long = 1
    val d: Int = 2
    val e: Short = 3
    val f: Byte = 4
    val g: String = "Hallo"

    print(a)
    print(b)
    print(c)
    print(d)
    print(e)
    print(f)
    print(g)
}

fun print(num: Any) {
    println(num::class.qualifiedName)
    println(num::class.java.name)
}
