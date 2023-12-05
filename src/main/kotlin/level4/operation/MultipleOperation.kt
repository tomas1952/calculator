package level4.operation

import java.lang.RuntimeException

class MultipleOperation : AbstractOperation {

    override fun operate(a: Number, b: Number): Number = when {
        // Int
        a is Int && b is Int -> a.times(b)
        a is Int && b is Long -> a.times(b)
        a is Int && b is Float -> a.times(b)
        a is Int && b is Double -> a.times(b)

        // Long
        a is Long && b is Int -> a.times(b)
        a is Long && b is Long -> a.times(b)
        a is Long && b is Float -> a.times(b)
        a is Long && b is Double -> a.times(b)

        // Float
        a is Float && b is Int -> a.times(b)
        a is Float && b is Long -> a.times(b)
        a is Float && b is Float -> a.times(b)
        a is Float && b is Double -> a.times(b)

        // Double
        a is Double && b is Int -> a.times(b)
        a is Double && b is Long -> a.times(b)
        a is Double && b is Float -> a.times(b)
        a is Double && b is Double -> a.times(b)

        else -> throw RuntimeException("처리할 수 없는 타입입니다.")
    }
}