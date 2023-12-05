package exception

import java.lang.RuntimeException
class InvalidTypeException : RuntimeException("Int, Long, Float, Double 타입만 가능합니다.")