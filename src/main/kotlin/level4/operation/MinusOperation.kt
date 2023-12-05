package level4.operation

class MinusOperation : AbstractOperation {
    // Int
    override fun operate(a: Int, b: Int): Int = a.minus(b)
    override fun operate(a: Int, b: Long): Long = a.minus(b)
    override fun operate(a: Int, b: Float): Float  = a.minus(b)
    override fun operate(a: Int, b: Double): Double  = a.minus(b)
    
    // Long
    override fun operate(a: Long, b: Int): Long  = a.minus(b)
    override fun operate(a: Long, b: Long): Long  = a.minus(b)
    override fun operate(a: Long, b: Float): Float  = a.minus(b)
    override fun operate(a: Long, b: Double): Double  = a.minus(b)
    
    // Float
    override fun operate(a: Float, b: Int): Float  = a.minus(b)
    override fun operate(a: Float, b: Long): Float  = a.minus(b)
    override fun operate(a: Float, b: Float): Float  = a.minus(b)
    override fun operate(a: Float, b: Double): Double  = a.minus(b)
    
    // Double

    override fun operate(a: Double, b: Int): Double  = a.minus(b)
    override fun operate(a: Double, b: Long): Double  = a.minus(b)
    override fun operate(a: Double, b: Float): Double  = a.minus(b)
    override fun operate(a: Double, b: Double): Double  = a.minus(b)

}