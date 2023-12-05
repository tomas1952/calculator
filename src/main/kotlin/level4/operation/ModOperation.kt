package level4.operation

class ModOperation : AbstractOperation {
    // Int
    override fun operate(a: Int, b: Int): Int = a.mod(b)
    override fun operate(a: Int, b: Long): Long = a.mod(b)
    override fun operate(a: Int, b: Float): Float  = a.toFloat().mod(b)
    override fun operate(a: Int, b: Double): Double  = a.toDouble().mod(b)
    
    // Long
    override fun operate(a: Long, b: Int): Long  = a.mod(b.toLong())
    override fun operate(a: Long, b: Long): Long  = a.mod(b)
    override fun operate(a: Long, b: Float): Float  = a.toFloat().mod(b)
    override fun operate(a: Long, b: Double): Double  = a.toDouble().mod(b)
    
    // Float
    override fun operate(a: Float, b: Int): Float  = a.mod(b.toFloat())
    override fun operate(a: Float, b: Long): Float  = a.mod(b.toFloat())
    override fun operate(a: Float, b: Float): Float  = a.mod(b)
    override fun operate(a: Float, b: Double): Double  = a.mod(b)
    
    // Double

    override fun operate(a: Double, b: Int): Double  = a.mod(b.toDouble())
    override fun operate(a: Double, b: Long): Double  = a.mod(b.toDouble())
    override fun operate(a: Double, b: Float): Double  = a.mod(b)
    override fun operate(a: Double, b: Double): Double  = a.mod(b)

}