package level4.operation

class AddOperation : AbstractOperation {
    // Int
    override fun operate(a: Int, b: Int): Int = a.plus(b)
    override fun operate(a: Int, b: Long): Long = a.plus(b)
    override fun operate(a: Int, b: Float): Float  = a.plus(b)
    override fun operate(a: Int, b: Double): Double  = a.plus(b)
    
    // Long
    override fun operate(a: Long, b: Int): Long  = a.plus(b)
    override fun operate(a: Long, b: Long): Long  = a.plus(b)
    override fun operate(a: Long, b: Float): Float  = a.plus(b)
    override fun operate(a: Long, b: Double): Double  = a.plus(b)
    
    // Float
    override fun operate(a: Float, b: Int): Float  = a.plus(b)
    override fun operate(a: Float, b: Long): Float  = a.plus(b)
    override fun operate(a: Float, b: Float): Float  = a.plus(b)
    override fun operate(a: Float, b: Double): Double  = a.plus(b)
    
    // Double

    override fun operate(a: Double, b: Int): Double  = a.plus(b)
    override fun operate(a: Double, b: Long): Double  = a.plus(b)
    override fun operate(a: Double, b: Float): Double  = a.plus(b)
    override fun operate(a: Double, b: Double): Double  = a.plus(b)

}