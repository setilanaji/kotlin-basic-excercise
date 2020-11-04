fun main() {

    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    print(sumListOfNumbers(numbers))
}

fun sumListOfNumbers(list: List<Int>): Int{
    var sum: Int = 0

    for ( (index, num) in list.sorted().withIndex()){
        if (index == list.lastIndex){
            break
        }
        sum += num
    }
    return sum
}