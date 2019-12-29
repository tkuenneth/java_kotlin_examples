package javakotlinexamples.kotlin

fun main(args: Array<String>) {

    val a = 123.45f
    val b = 123.45
    val c = 1L
    val d = 2
    val e = 3.toShort()
    val f = 4.toByte()
    val g = true

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
}
