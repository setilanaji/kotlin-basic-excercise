fun main() {
    try {
        print("Masukan tahun mulai: ")
        val start = readLine()!!.toInt()
        print("Masukan tahun akhir: ")
        val end = readLine()!!.toInt()
        printLeapYears(start, end)

    }catch (e: Exception){
        print("TIdak dapat membaca masukan anda")
    }
}

fun printLeapYears(start: Int, end: Int){
    for (year in start..end){
        println(isLeapYear(year))
    }
}

fun isLeapYear(year: Int): String = if (year % 4 == 0) "$year adalah tahun kabisat" else "$year bukan tahun kabisat"