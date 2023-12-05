package level4.operation

abstract class AbstractOperation {

    // Int
    abstract fun operation(a: Int, b: Int) : Int
    abstract fun operation(a: Int, b: Long) : Long
    abstract fun operation(a: Int, b: Float) : Float
    abstract fun operation(a: Int, b: Double) : Double

    // Long
    abstract fun operation(a: Long, b: Int) : Long
    abstract fun operation(a: Long, b: Long) : Long
    abstract fun operation(a: Long, b: Float) : Float
    abstract fun operation(a: Long, b: Double) : Double

    // Float
    abstract fun operation(a: Float, b: Int) : Float
    abstract fun operation(a: Float, b: Long) : Float
    abstract fun operation(a: Float, b: Float) : Float
    abstract fun operation(a: Float, b: Double) : Double

    // Double
    abstract fun operation(a: Double, b: Int) : Double
    abstract fun operation(a: Double, b: Long) : Double
    abstract fun operation(a: Double, b: Float) : Double
    abstract fun operation(a: Double, b: Double) : Double

}