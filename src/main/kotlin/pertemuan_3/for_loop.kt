package pertemuan_3

fun main() {

    for (i in 1..5) {
        println("Nilai = $i")
    }
    //Atau kebalikannya
    for (i in 5 downTo 1) {
        println("Nilai = $i")
    }

    val cars = arrayOf("Volvo","BMW","Ford","Mazda")
    for (x in cars){
        println(x)
    }

    var i = 0
    while (i < 5) {
        println("nilai $i")
        i++
    }

    var percobaan = 1
    do {
        println("Buka pintu - percobaan ke $percobaan")
        percobaan++
    } while (percobaan < 5)
}