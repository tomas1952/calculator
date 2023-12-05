package level2
import exception.CustomDividedZeroException
import level2.Operator.*

class Lv2Calculator {
    fun operating(
            operator: Operator,
            a: Int,
            b: Int,
    ): Int = when (operator) {
        minus -> a.minus(b)
        multiple -> a.times(b)
        divide -> if (b == 0) throw CustomDividedZeroException() else a.div(b)
        mod -> if (b == 0) throw CustomDividedZeroException() else a.mod(b)
        else -> a.plus(b)
    }
    fun operating(
            operator: Operator,
            a: Long,
            b: Long,
    ): Long = when (operator) {
        minus -> a.minus(b)
        multiple -> a.times(b)
        divide -> if (b == 0L) throw CustomDividedZeroException() else a.div(b)
        mod -> if (b == 0L) throw CustomDividedZeroException() else a.mod(b)
        else -> a.plus(b)
    }

    fun operating(
            operator: Operator,
            a: Float,
            b: Float,
    ): Float = when (operator) {
        minus -> a.minus(b)
        multiple -> a.times(b)
        divide -> if (b == 0.0f) throw CustomDividedZeroException() else a.div(b)
        mod -> if (b == 0.0f) throw CustomDividedZeroException() else a.mod(b)
        else -> a.plus(b)
    }

    fun operating(
            operator: Operator,
            a: Double,
            b: Double,
    ): Double = when (operator) {
        minus -> a.minus(b)
        multiple -> a.times(b)
        divide -> if (b == 0.0) throw RuntimeException("0은 나누기를 할 수 없습니다.") else a.div(b)
        mod -> if (b == 0.0) throw RuntimeException("0은 나누기를 할 수 없습니다.") else a.mod(b)
        else -> a.plus(b)
    }
}


