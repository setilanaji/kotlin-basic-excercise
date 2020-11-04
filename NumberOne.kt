import kotlin.math.pow

fun main() {
    val x = 64
    val y = 2

    printOperationsResult(x, y)
}

fun printOperationsResult(x: Int, y: Int){
    println(addition(x, y))
    println(subtraction(x, y))
    println(pow(x, y))
    println(root(x, y))
    println(division(x, y))
    print(multiply(x, y))
}

fun addition(x: Int, y: Int): Int = x + y;

fun subtraction(x: Int, y: Int): Int = x - y;

fun pow(x: Int, y: Int): Double = x.toDouble().pow(y);

fun root(x: Int, y: Int): Double = x.toDouble().pow(1/y.toDouble());

fun division(x: Int, y: Int): Int = x / y;

fun multiply(x: Int, y: Int): Int = x * y;
