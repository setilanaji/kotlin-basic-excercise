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

     if (isEven(num)){
         if (isMultipleOfFive(num)){
             return "Imperio Aberto"
         }
         return "Imperio"
     } else {
        if (isMultipleOfFour(num)){
            return "Crucio Reducto"
        }
         return "Crucio"
     }
}

fun isEven(num: Int): Boolean = num % 2 == 0

fun isMultipleOfFive(num: Int): Boolean = num % 5 == 0

fun isMultipleOfFour(num: Int): Boolean = num % 4 == 0