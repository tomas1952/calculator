package level4.operation

class MultipleOperation : AbstractOperation {
    // Int
    override fun operate(a: Int, b: Int): Int = a.times(b)
    override fun operate(a: Int, b: Long): Long = a.times(b)
    override fun operate(a: Int, b: Float): Float  = a.times(b)
    override fun operate(a: Int, b: Double): Double  = a.times(b)
    
    // Long
    override fun operate(a: Long, b: Int): Long  = a.times(b)
    override fun operate(a: Long, b: Long): Long  = a.times(b)
    override fun operate(a: Long, b: Float): Float  = a.times(b)
    override fun operate(a: Long, b: Double): Double  = a.times(b)
    
    // Float
    override fun operate(a: Float, b: Int): Float  = a.times(b)
    override fun operate(a: Float, b: Long): Float  = a.times(b)
    override fun operate(a: Float, b: Float): Float  = a.times(b)
    override fun operate(a: Float, b: Double): Double  = a.times(b)
    
    // Double

    override fun operate(a: Double, b: Int): Double  = a.times(b)
    override fun operate(a: Double, b: Long): Double  = a.times(b)
    override fun operate(a: Double, b: Float): Double  = a.times(b)
    override fun operate(a: Double, b: Double): Double  = a.times(b)

}