fun main() {
    val list = listOf("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis")
    uniteList(list)
}

fun uniteList(list: List<String>) = list.forEach{ print("$it ") }
