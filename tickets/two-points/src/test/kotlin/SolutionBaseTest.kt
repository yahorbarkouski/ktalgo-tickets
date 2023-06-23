import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionBaseTest {

    private val solution: Solution = Solution()

    @Test
    fun `sum of two points returns correct summed point 1`() {
        val result = solution.solution(Point(1, 2), Point(3, 4))
        assertEquals(Point(4, 6), result)
    }

    @Test
    fun `sum of two points returns correct summed point 2`() {
        val result = solution.solution(Point(0, 0), Point(0, 0))
        assertEquals(Point(0, 0), result)
    }

    @Test
    fun `sum of two points returns correct summed point 3`() {
        val result = solution.solution(Point(-1, -100), Point(1, 100))
        assertEquals(Point(0, 0), result)
    }
}

