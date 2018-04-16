package javakotlinexamples.kotlin

fun main(args: Array<String>) {
    var poko = POKO("Hallo", 1)
    poko.aString = "MATHEMA"
    poko.anInt = 42
    print(poko)

    poko = POKO(false)
    print(poko)

    poko = POKO(true)
    print(poko)
}

fun print(poko: POKO) {
    println("${poko.aString}, ${poko.computedValue}")
}

class POKO constructor(var aString: String, var anInt: Int) {

    companion object {
        var counter: Int = 0
    }

    val computedValue: Int
        get() = anInt * anInt

    init {
        println(POKO.counter++)
    }

    constructor(aBoolean: Boolean) : this(
            if (aBoolean) "MATHEMA" else "Campus,",
            if (aBoolean) 3 else 4
    )
}