package javakotlinexamples.kotlin

fun main(args: Array<String>) {

    // Null can not be a value of a non-null type String
    val stringThatCannotBeNull: String = "Campus"
    println(stringThatCannotBeNull.length)

    val stringThatCanBeNull: String? = null
    // Only safe (?.) or non-null asserted (!!) calls are allowed
    // on a nullable receiver of type String
    println(stringThatCanBeNull?.length ?: -1)

    // println(stringThatCanBeNull!!.length)
}