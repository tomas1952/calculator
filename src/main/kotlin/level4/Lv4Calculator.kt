package level4

import level4.operation.*

class Lv4Calculator(
    private val addOperation: AddOperation = AddOperation(),
    private val minusOperation: MinusOperation = MinusOperation(),
    private val multipleOperation: MultipleOperation = MultipleOperation(),
    private val divideOperation: DivideOperation = DivideOperation(),
    private val modOperation: ModOperation = ModOperation(),
) {
    fun operate(operation: AbstractOperation, a: Number, b: Number) = operation.operate(a, b)
    fun add(a: Number, b: Number) = operate(addOperation, a, b)
    fun minus(a: Number, b: Number) = operate(minusOperation, a, b)
    fun multiple(a: Number, b: Number) = operate(multipleOperation, a, b)
    fun divide(a: Number, b: Number) = operate(divideOperation, a, b)
    fun modulo(a: Number, b: Number) = operate(modOperation, a, b)
}


