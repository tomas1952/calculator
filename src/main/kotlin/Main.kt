import level2.Calculator
import level2.Operator.*

fun main(args: Array<String>) {
    val calculator = Calculator()
    val result = calculator.operating(plus, 10, 3)

    println(result)
}