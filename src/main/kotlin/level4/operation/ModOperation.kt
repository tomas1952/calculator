package level4.operation

import exception.CustomDividedZeroException
import exception.InvalidTypeException

class ModOperation : AbstractOperation {
    override fun operate(a: Number, b: Number): Number = when(b) {
        is Int -> {
            if (b == 0) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.mod(b)
                is Long -> a.mod(b.toLong())
                is Float -> a.mod(b.toFloat())
                is Double -> a.mod(b.toDouble())
                else -> throw InvalidTypeException()
            }
        }
        is Long -> {
            if (b == 0L) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.toLong().mod(b)
                is Long -> a.mod(b)
                is Float -> a.mod(b.toFloat())
                is Double -> a.mod(b.toDouble())
                else -> throw InvalidTypeException()
            }
        }
        is Float -> {
            if (b == 0f) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.toFloat().mod(b)
                is Long -> a.toFloat().mod(b)
                is Float -> a.mod(b)
                is Double -> a.mod(b.toDouble())
                else -> throw InvalidTypeException()
            }
        }
        is Double -> {
            if (b == 0.0) throw CustomDividedZeroException()

            when (a) {
                is Int -> a.toDouble().mod(b)
                is Long -> a.toDouble().mod(b)
                is Float -> a.mod(b)
                is Double -> a.mod(b)
                else -> throw InvalidTypeException()
            }
        }

        else -> throw InvalidTypeException()
    }

}