fun main() {

    val list = listOf(1..100).flatten()

    for (num in list){
        println(checkNumberStatus(num))
    }
}

fun checkNumberStatus(num: Int): String {
    var result: String = ""

    result += "${num}."
    result += if (isEvenNumber(num)) {
        " Genap"
    } else {
        " Ganjil"
    }
    if (isMultipleOfSeven(num)) result += " kelipatan tujuh"
    if (isMultipleOfEight(num)) result += " kelipatan delapan"
    if (isMultipleOfOneHundred(num)) result += " kelipatan seratus"

    return result
}


fun isEvenNumber(num: Int): Boolean = num % 2 == 0

fun isMultipleOfSeven(num: Int): Boolean = num % 7 == 0

fun isMultipleOfEight(num: Int): Boolean = num % 8 == 0

fun isMultipleOfOneHundred(num: Int): Boolean = num % 100 == 0