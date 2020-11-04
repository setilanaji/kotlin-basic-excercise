fun main() {
    print("Masukan Umur: ")
    val age = readLine()!!.toInt()
    print(checkRating(age))
}

fun checkRating(age: Int): String{
    return when{
        age >= 21 -> "DEWASA"
        age >= 13 -> "REMAJA"
        age >= 9 -> "BIMBINGAN ORANG TUA"
        age < 9 -> "SEMUA ORANG"
        else -> ""
    }
}