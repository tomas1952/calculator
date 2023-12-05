package level2
import exception.CustomDividedZeroException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.throwables.shouldThrowAny
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import level2.Operator.*

class CalculatorIntegerTest : BehaviorSpec({
    val calculator = Calculator()

    Given("10과 3이 주어졌을때") {
        val a = 10
        val b = 3

        When("계산기로 더하면") {
            val result = calculator.operating(plus, a, b)
            Then("13이 나와야 한다.") {
                result shouldBe 13
            }
        }

        When("계산기로 빼면") {
            val result = calculator.operating(minus, a, b)
            Then("7이 나와야 한다.") {
                result shouldBe 7
            }
        }

        When("계산기로 곱하면") {
            val result = calculator.operating(multiple, a, b)
            Then("30이 나와야 한다.") {
                result shouldBe 30
            }
        }

        When("계산기로 나누면") {
            val result = calculator.operating(divide, a, b)
            Then("3이 나와야 한다.") {
                result shouldBe 3
            }
        }

        When("계산기로 나머지 연산을 하면") {
            val result = calculator.operating(mod, a, b)
            Then("1이 나와야 한다.") {
                result shouldBe 1
            }
        }
    }


    Given("10과 0이 주어졌을때") {
        val a = 10
        val b = 0

        When("계산기로 나누면") {
            Then("devided zero 에러가 발생한다.") {
                shouldThrow<CustomDividedZeroException> {
                    calculator.operating(divide, a, b)
                }
            }
        }

        When("계산기로 나머지 연산을 하면") {
            Then("divided zero 에러가 발생한다.") {
                shouldThrow<CustomDividedZeroException> {
                    calculator.operating(divide, a, b)
                }
            }
        }
    }
})