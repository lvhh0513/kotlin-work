// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median of 1 element" {
        median(listOf(7.0f)) shouldBe (7.0f plusOrMinus tolerance)
    }
    "Median of 2 elements" {
        median(listOf(10.0f, 20.0f)) shouldBe (15.0f plusOrMinus tolerance)
    }
    "Median of 3 elements" {
        median(listOf(9.0f, 1.0f, 5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }
    "Median of 4 elements" {
        median(listOf(8.0f, 2.0f, 10.0f, 4.0f)) shouldBe (6.0f plusOrMinus tolerance)
    }
})
