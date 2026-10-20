// Task 7.7.1: statistics 
// Copied in week3 porfolio as the assignment said

fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) {"List cannot be empty"}
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