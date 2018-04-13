package javakotlinexamples.kotlin

fun main(args: Array<String>) {
    val num = (Math.random() * 4).toInt()
    println("$num ist ${if (isEven(num)) "gerade" else "ungerade"}")

    when (num) {
        0 -> println("0")
        2 -> println("2")
        else -> println("1 oder 3")
    }
}

fun isEven(num: Int): Boolean {
    return (num % 2) != 1
}