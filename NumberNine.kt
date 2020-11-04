fun main() {
    print("Masukan text: ")
    val text = readLine()!!.toString()
    print(getTextLength(text))
}

fun getTextLength(text: String): Int = text.toCharArray().lastIndex + 1
