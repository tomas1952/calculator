import level2.Lv2Calculator
import level2.Operator.*

fun main(args: Array<String>) {
    val calculator = Lv2Calculator()
    val result1 = calculator.operating(plus, 10, 3)
    println(result1)

    val lv4Calculator = level4.Lv4Calculator()
    val result2 = lv4Calculator.add(10, 20f)
    println(result2)
}