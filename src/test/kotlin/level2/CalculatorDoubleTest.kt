package level2
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.comparables.shouldBeLessThan
import io.kotest.matchers.shouldBe
import level2.Operator.*

class CalculatorDoubleTest : BehaviorSpec({
    val calculator = Lv2Calculator()

    Given("10과 3이 주어졌을때") {
        val a = 10.0
        val b = 0.3

        When("계산기로 더하면") {
            val result = calculator.operate(plus, a, b)
            Then("10.3이 나와야 한다.") {
                result shouldBe 10.3
            }
        }

        When("계산기로 빼면") {
            val result = calculator.operate(minus, a, b)
            Then("9.7이 나와야 한다.") {
                result shouldBe 9.7
            }
        }

        When("계산기로 곱하면") {
            val result = calculator.operate(multiple, a, b)
            Then("3이 나와야 한다.") {
                result shouldBe 3.0
            }
        }

        When("계산기로 나누면") {
            val result = calculator.operate(divide, a, b)
            Then("33.33332 ~ 33.33334 값이 나와야 한다.") {
                result shouldBeGreaterThan 33.33332
                result shouldBeLessThan 33.33334
            }
        }

        When("계산기로 나머지 연산을 하면") {
            val result = calculator.operate(mod, a, b)
            Then("0.1이 나와야 한다.") {
                result shouldBeGreaterThan  0.0999999
                result shouldBeLessThan  0.1000001
            }
        }
    }
})