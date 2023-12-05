package level4.operation

import exception.CustomDividedZeroException

class ModOperation : AbstractOperation {
    // Int
    override fun operate(a: Int, b: Int): Int = if (b == 0) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b)
    }

    override fun operate(a: Int, b: Long): Long = if (b == 0L) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b)
    }
    override fun operate(a: Int, b: Float): Float = if (b == 0f) {
        throw CustomDividedZeroException()
    } else {
        a.toFloat().mod(b)
    }

    override fun operate(a: Int, b: Double): Double = if (b == 0.0) {
        throw CustomDividedZeroException()
    } else {
        a.toDouble().mod(b)
    }
    
    // Long
    override fun operate(a: Long, b: Int): Long = if (b == 0) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b.toLong())
    }

    override fun operate(a: Long, b: Long): Long = if (b == 0L) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b)
    }
    override fun operate(a: Long, b: Float): Float = if (b == 0f) {
        throw CustomDividedZeroException()
    } else {
        a.toFloat().mod(b)
    }
    override fun operate(a: Long, b: Double): Double = if (b == 0.0) {
        throw CustomDividedZeroException()
    } else {
        a.toDouble().mod(b)
    }

    // Float
    override fun operate(a: Float, b: Int): Float = if (b == 0) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b.toFloat())
    }

    override fun operate(a: Float, b: Long): Float = if (b == 0L) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b.toFloat())
    }

    override fun operate(a: Float, b: Float): Float = if (b == 0f) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b)
    }

    override fun operate(a: Float, b: Double): Double = if (b == 0.0) {
        throw CustomDividedZeroException()
    } else {
        a.toDouble().mod(b)
    }
    
    // Double

    override fun operate(a: Double, b: Int): Double = if (b == 0) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b.toDouble())
    }
    override fun operate(a: Double, b: Long): Double = if (b == 0L) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b.toDouble())
    }
    override fun operate(a: Double, b: Float): Double  = if (b == 0f) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b)
    }
    override fun operate(a: Double, b: Double): Double  = if (b == 0.0) {
        throw CustomDividedZeroException()
    } else {
        a.mod(b)
    }

}