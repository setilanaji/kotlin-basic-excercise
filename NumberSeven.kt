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
        if (!isLeapYear(year)){
            println("$year bukan tahun kabisat")
        } else{
            println("$year adalah tahun kabisat")
        }
    }
}

fun isLeapYear(year: Int): Boolean = year % 4 == 0