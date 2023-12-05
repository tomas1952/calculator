package level4.operation

import exception.InvalidTypeException

class AddOperation : AbstractOperation {
    override fun operate(a: Number, b: Number): Number = when {
        // Int
        a is Int && b is Int -> a.plus(b)
        a is Int && b is Long -> a.plus(b)
        a is Int && b is Float -> a.plus(b)
        a is Int && b is Double -> a.plus(b)

        // Long
        a is Long && b is Int -> a.plus(b)
        a is Long && b is Long -> a.plus(b)
        a is Long && b is Float -> a.plus(b)
        a is Long && b is Double -> a.plus(b)

        // Float
        a is Float && b is Int -> a.plus(b)
        a is Float && b is Long -> a.plus(b)
        a is Float && b is Float -> a.plus(b)
        a is Float && b is Double -> a.plus(b)

        // Double
        a is Double && b is Int -> a.plus(b)
        a is Double && b is Long -> a.plus(b)
        a is Double && b is Float -> a.plus(b)
        a is Double && b is Double -> a.plus(b)

        else -> throw InvalidTypeException()
    }
}