package level4.operation

import exception.CustomDividedZeroException
import exception.InvalidTypeException

class DivideOperation : AbstractOperation {
    override fun operate(a: Number, b: Number): Number = when(b) {
        is Int -> {
            if (b == 0) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw InvalidTypeException()
            }
        }
        is Long -> {
            if (b == 0L) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw InvalidTypeException()
            }
        }
        is Float -> {
            if (b == 0f) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw InvalidTypeException()
            }
        }
        is Double -> {
            if (b == 0.0) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.div(b)
                is Long -> a.div(b)
                is Float -> a.div(b)
                is Double -> a.div(b)
                else -> throw InvalidTypeException()
            }
        }

        else -> throw InvalidTypeException()
    }
}