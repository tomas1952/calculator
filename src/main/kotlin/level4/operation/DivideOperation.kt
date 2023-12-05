package level4.operation

import exception.CustomDividedZeroException
import java.lang.RuntimeException

class DivideOperation : AbstractOperation {
    override fun operate(a: Number, b: Number): Number = when(b) {
        is Int -> {
            if (b == 0) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw RuntimeException("처리할 수 없는 타입입니다.")
            }
        }
        is Long -> {
            if (b == 0L) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw RuntimeException("처리할 수 없는 타입입니다.")
            }
        }
        is Float -> {
            if (b == 0f) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw RuntimeException("처리할 수 없는 타입입니다.")
            }
        }
        is Double -> {
            if (b == 0.0) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw RuntimeException("처리할 수 없는 타입입니다.")
            }
        }

        else -> throw RuntimeException("처리할 수 없는 타입입니다.")
    }
}