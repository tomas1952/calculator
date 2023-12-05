package level4
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.comparables.shouldBeLessThan
import io.kotest.matchers.shouldBe

class CalculatorDoubleTest : BehaviorSpec({
    val calculator = Lv4Calculator()

    Given("10과 3이 주어졌을때") {
        val a = 10.0
        val b = 0.3

        When("계산기로 더하면") {
            val result = calculator.add(a, b)
            Then("13이 나와야 한다.") {
                result shouldBe 10.3
            }
        }

        When("계산기로 빼면") {
            val result = calculator.minus(a, b)
            Then("7이 나와야 한다.") {
                result shouldBe 9.7
            }
        }

        When("계산기로 곱하면") {
            val result = calculator.multiple(a, b)
            Then("30이 나와야 한다.") {
                result shouldBe 3.0
            }
        }

        When("계산기로 나누면") {
            val result = calculator.divide(a, b)
            Then("3이 나와야 한다.") {
                result.toDouble() shouldBeGreaterThan 33.33332
                result.toDouble() shouldBeLessThan 33.33334
            }
        }

        When("계산기로 나머지 연산을 하면") {
            val result = calculator.modulo(a, b)
            Then("1이 나와야 한다.") {
                result.toDouble() shouldBeGreaterThan  0.0999995
                result.toDouble() shouldBeLessThan  0.1000005
            }
        }
    }
})