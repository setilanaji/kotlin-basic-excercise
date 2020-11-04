fun main() {

    val listOfNumber = listOf(1..1000).flatten()

    getPrimeNumbers(listOfNumber)
}

fun getPrimeNumbers(list: List<Int>) {

    for (num in list){
        if (isPrime(num) && num > 1){
            print("$num ")
        }
    }

}

fun isPrime(num: Int): Boolean{
    var status = true
        for (i in 2..num / 2){
            if (num % i == 0){
                status = false
                break
            }
        }
    return status
}