// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {
    val sorted = numbers.sorted()
    val size = numbers.size
    var median: Float

    if (size % 2 == 0) {
        val middle1 = sorted[size / 2 - 1]
        val middle2 = sorted[size / 2]
        median = (middle1 + middle2) / 2
    } else {
        median= sorted[size / 2]
    }

    return median
}