package javakotlinexamples.kotlin

val words = arrayOf(
        "Donaudampfschifffahrtsgesellschaft",
        "Finanzdienstleistungsunternehmen",
        "Bundesausbildungsförderungsgesetz"
)

fun main(args: Array<String>) {
    var spielen = true
    while (spielen) {
        val wort = zuRatendesWortBestimmen()
        val anzeige = Array(wort.length) { if (it == 0) wort[0] else '-' }
        val maxVersuche = 5
        var versuch = 1
        var raten = true
        while (raten) {
            anzeige.forEach { print(it) }
            println("\nBitte raten (Versuch $versuch von $maxVersuche): ")
            val eingabe = readLine().orEmpty()
            if (eingabe.isEmpty()) {
                continue
            }
            if (eingabe.length == 1) {
                var treffer = 0
                var gleich = 0
                for (pos in wort.indices) {
                    if (wort[pos].toLowerCase() == eingabe[0].toLowerCase()) {
                        treffer += 1
                        anzeige[pos] = wort[pos]
                    }
                    if (wort[pos] == anzeige[pos]) {
                        gleich += 1
                    }
                }
                if (wort.length == gleich) {
                    println("Super, alle gefunden")
                    break
                }
            } else {
                if (eingabe.toLowerCase() == wort.toLowerCase()) {
                    println("Cool, richtig gertaen")
                    break
                }
            }
            versuch += 1
            raten = versuch <= maxVersuche
            if (!raten) {
                println("Schade, hat leider nicht geklappt")
            }
        }
        print("Noch ein Spiel (j/n)?")
        val eingabe = readLine().orEmpty()
        if (eingabe.toLowerCase() == "n") {
            spielen = false
        }
    }
}

fun zuRatendesWortBestimmen() = words[(Math.random() * words.size).toInt()]