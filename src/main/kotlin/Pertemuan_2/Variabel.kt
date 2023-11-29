package Pertemuan_2

fun main () {

    val namaDepan: String = "Piresabil panji"
    val namaBelakang = "Wistyorafi"
    var usia = 15
    usia = 18

    println("Hallo nama saya $namaDepan $namaBelakang usia saya $usia")

    val text: String? = null
    val panjangText = text?.length
    println(panjangText)

    var vocal = 'A'
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)

    val integerlist = listOf(4,2,1,5,1,2)
    val integerset = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New delhi" to "India"
    )

    println(integerlist)
    println(integerlist[0])
    println(integerset)

    println(capital)
    println(capital["New delhi"])

    val anylist  = mutableListOf("Panji", 'T', true, User())

    anylist.add("Peepeepoopoo")
    anylist.add(2,"RED")
    anylist[2]='U'
    anylist.removeAt(4)

    println(anylist)
}

fun User() {

}