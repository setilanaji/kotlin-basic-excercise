fun main() {

    val list = listOf(1..1000).flatten()

    for (num in list){
        println(checkNumberStatus(num))
    }
}

fun checkNumberStatus(num: Int): String = "${num}.${isEvenNumber(num)}${isMultipleOfSeven(num)}${isMultipleOfEight(num)}${isMultipleOfOneHundred(num)}"

fun isEvenNumber(num: Int): String = if (num % 2 == 0) " Genap" else " Ganjil"

fun isMultipleOfSeven(num: Int): String = if (num % 7 == 0) " Kelipatan tujuh" else ""

fun isMultipleOfEight(num: Int): String = if (num % 8 == 0) " Kelipatan delapan" else ""

fun isMultipleOfOneHundred(num: Int): String = if (num % 100 == 0) " Kelipatan Seratus" else ""