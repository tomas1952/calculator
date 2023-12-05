import level2.Calculator
import level2.Operator.*

fun main(args: Array<String>) {
    val calculator = Calculator()

    val a0 = 10
    val b0 = 3

    println("정수형 연산")
    println("$a0 + $b0 = ${13} -> ${calculator.operating(plus, a0, b0)}")
    println("$a0 - $b0 = ${7} -> ${calculator.operating(minus, a0, b0)}")
    println("$a0 * $b0 = ${30} -> ${calculator.operating(multiple, a0, b0)}")
    println("$a0 / $b0 = ${3} -> ${calculator.operating(divide, a0, b0)}")
    println("$a0 % $b0 = ${1} -> ${calculator.operating(mod, a0, b0)}")

    val a1 = 10.0
    val b1 = 3.0

    println("$a1 + $b1 = ${13} -> ${calculator.operating(plus, a1, b1)}")
    println("$a1 - $b1 = ${7} -> ${calculator.operating(minus, a1, b1)}")
    println("$a1 * $b1 = ${30} -> ${calculator.operating(multiple, a1, b1)}")
    println("$a1 / $b1 = ${3} -> ${calculator.operating(divide, a1, b1)}")
    println("$a1 % $b1 = ${1} -> ${calculator.operating(mod, a1, b1)}")
}