package javakotlinexamples.kotlin

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.nio.charset.Charset
import java.util.logging.Level
import java.util.logging.Logger

val LOGGER = object {
    val javaLogger = Logger.getLogger(this::class.java.name)
}.javaLogger!!

fun main(args: Array<String>) {
    val temp = try {
        File.createTempFile("MATHEMA_Campus_2018", ".txt")
    } catch (e: IOException) {
        LOGGER.log(Level.SEVERE, "whoops", e)
        null
    }
    if (temp != null) {
        temp.deleteOnExit()
        LOGGER.info(temp.absolutePath)
        val fos: FileOutputStream? = try {
            val fos = FileOutputStream(temp)
            fos.write("Hallo MATHEMA Campus".toByteArray(Charset.forName("UTF8")))
            fos
        } catch (e: IOException) {
            LOGGER.log(Level.SEVERE, "whoops", e)
            null
        }
        if (fos != null) {
            try {
                fos.close()
            } catch (e: IOException) {
                LOGGER.log(Level.SEVERE, "close() failed", e)
            }
        }
    }
}
