package level4
import exception.CustomDividedZeroException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CalculatorIntegerTest : BehaviorSpec({
    val calculator = Lv4Calculator()

    Given("10과 3이 주어졌을때") {
        val a = 10
        val b = 3

        When("계산기로 더하면") {
            val result = calculator.add(a, b)
            Then("13이 나와야 한다.") {
                result shouldBe 13
            }
        }

        When("계산기로 빼면") {
            val result = calculator.minus(a, b)
            Then("7이 나와야 한다.") {
                result shouldBe 7
            }
        }

        When("계산기로 곱하면") {
            val result = calculator.multiple(a, b)
            Then("30이 나와야 한다.") {
                result shouldBe 30
            }
        }

        When("계산기로 나누면") {
            val result = calculator.divide(a, b)
            Then("3이 나와야 한다.") {
                result shouldBe 3
            }
        }

        When("계산기로 나머지 연산을 하면") {
            val result = calculator.modulo(a, b)
            Then("1이 나와야 한다.") {
                result shouldBe 1
            }
        }
    }


    Given("10과 0이 주어졌을때") {
        val a = 10
        val b = 0

        When("계산기로 나누면") {
            Then("divided zero 에러가 발생한다.") {
                shouldThrow<CustomDividedZeroException> {
                    calculator.divide(a, b)
                }
            }
        }

        When("계산기로 나머지 연산을 하면") {
            Then("divided zero 에러가 발생한다.") {
                shouldThrow<CustomDividedZeroException> {
                    calculator.modulo(a, b)
                }
            }
        }
    }
})