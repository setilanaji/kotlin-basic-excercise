fun main() {
    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    val indices = listOf(8, 7, 2, 8, 2, 6)
    print(getSliceOfTwoList(numbers, indices))
}

//fun getSliceOfTwoList(first: List<Int>, second: List<Int>): List<Int> = first.intersect(second).toList()
fun getSliceOfTwoList(first: List<Int>, second: List<Int>): List<Int> {

    val list = mutableListOf<Int>()

    for ( value in first){
        if (compare(value ,second)){
            list.add(value)
        }
    }
    return list.toSet().toList()
}

fun compare(value: Int, list: List<Int> ): Boolean {
    var status: Boolean = false
    for (i in list){
        if (i == value){
            status = true
            break
        }
    }
    return status
}