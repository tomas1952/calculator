package level4.operation

interface AbstractOperation {

    // Int
    fun operate(a: Int, b: Int) : Int
    fun operate(a: Int, b: Long) : Long
     fun operate(a: Int, b: Float) : Float
     fun operate(a: Int, b: Double) : Double

    // Long
     fun operate(a: Long, b: Int) : Long
     fun operate(a: Long, b: Long) : Long
     fun operate(a: Long, b: Float) : Float
     fun operate(a: Long, b: Double) : Double

    // Float
     fun operate(a: Float, b: Int) : Float
     fun operate(a: Float, b: Long) : Float
     fun operate(a: Float, b: Float) : Float
     fun operate(a: Float, b: Double) : Double

    // Double
     fun operate(a: Double, b: Int) : Double
     fun operate(a: Double, b: Long) : Double
     fun operate(a: Double, b: Float) : Double
     fun operate(a: Double, b: Double) : Double

}