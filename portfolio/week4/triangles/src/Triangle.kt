// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw IllegalArgumentException("Invalid Triangle")
        }
    }
    val perimeter: Double 
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2.0

    val area: Double
        get() {
            val a = sideA
            val b = sideB
            val c = sideC
            val s = semiPerimeter
            
            val result = sqrt(s * (s - a) * (s - b) * (s - c))
            return result
        }
    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}