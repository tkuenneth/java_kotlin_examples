package javakotlinexamples.kotlin

import java.io.File
import java.io.FileOutputStream
import java.nio.charset.Charset
import java.util.logging.Logger

val LOGGER = object {
    val javaLogger = Logger.getLogger(this::class.java.name)
}.javaLogger!!

fun main(args: Array<String>) {
    val temp = File.createTempFile("MATHEMA_Campus_2018", ".txt")
    temp.deleteOnExit()
    LOGGER.info(temp.absolutePath)
    val fos = FileOutputStream(temp)
    fos.write("Hallo MATHEMA Campus".toByteArray(Charset.forName("UTF8")))
    fos.close()
}
