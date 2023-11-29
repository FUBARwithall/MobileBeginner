package pertemuan_3

fun main () {

    val nilai = 70

    if (nilai > 50) {
        println("Lulus")
    } else {
        println("Tidak lulus")
    }

    //if didalam if
    if (nilai > 70) {
        println("A")
    } else if (nilai > 60) {
        println("B")
    } else {
        println("C")
    }

    val number = 5
    val hasil = when (number) {
        1 -> "Satu"
        2 -> "Dua"
        3 -> "Tiga"
        else -> "Nomor tidak valid"
    }
    println(hasil)
}