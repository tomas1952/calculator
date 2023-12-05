package level4.operation

class DivideOperation : AbstractOperation {
    // Int
    override fun operate(a: Int, b: Int): Int = a.div(b)
    override fun operate(a: Int, b: Long): Long = a.div(b)
    override fun operate(a: Int, b: Float): Float  = a.div(b)
    override fun operate(a: Int, b: Double): Double  = a.div(b)
    
    // Long
    override fun operate(a: Long, b: Int): Long  = a.div(b)
    override fun operate(a: Long, b: Long): Long  = a.div(b)
    override fun operate(a: Long, b: Float): Float  = a.div(b)
    override fun operate(a: Long, b: Double): Double  = a.div(b)
    
    // Float
    override fun operate(a: Float, b: Int): Float  = a.div(b)
    override fun operate(a: Float, b: Long): Float  = a.div(b)
    override fun operate(a: Float, b: Float): Float  = a.div(b)
    override fun operate(a: Float, b: Double): Double  = a.div(b)
    
    // Double

    override fun operate(a: Double, b: Int): Double  = a.div(b)
    override fun operate(a: Double, b: Long): Double  = a.div(b)
    override fun operate(a: Double, b: Float): Double  = a.div(b)
    override fun operate(a: Double, b: Double): Double  = a.div(b)

}