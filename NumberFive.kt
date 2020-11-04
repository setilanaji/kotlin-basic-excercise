import java.lang.NumberFormatException

fun main() {
    print("Masukan Umur: ")
    try {
        val age = readLine()!!.toInt()
        print(checkRating(age))
    }catch (e: NumberFormatException){
        print("masukan anda tidak bisa dibaca")
    }

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