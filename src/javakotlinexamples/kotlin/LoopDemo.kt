package javakotlinexamples.kotlin

fun main(args: Array<String>) {

    // for loop iterates through anything that provides an iterator.

    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val array = arrayOf("Eins", "Zwei", "Drei")
    for (i in array.indices) {
        println(array[i])
    }
}