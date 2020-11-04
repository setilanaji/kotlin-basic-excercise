import java.lang.NumberFormatException

fun main() {

    print("Masukan angka: ")
    try {
        val num = readLine()!!.toInt()
        print(checkNumber(num))

    }catch (e: NumberFormatException){
        print("tidak dapat membaca masukan anda")
    }


}

fun checkNumber(num: Int): String{

    var result = ""
    if (isEven(num)){
        result = "Imperio"
        if (isMultipleOfFive(num)){
            result = "Imperio Aberto"
        }
    } else {
        result = "Crucio"
        if (isMultipleOfFour(num)){
            result = "Crucio Reducto"
        }
    }
    return result
}

fun isEven(num: Int): Boolean = num % 2 == 0

fun isMultipleOfFive(num: Int): Boolean = num % 5 == 0

fun isMultipleOfFour(num: Int): Boolean = num % 4 == 0