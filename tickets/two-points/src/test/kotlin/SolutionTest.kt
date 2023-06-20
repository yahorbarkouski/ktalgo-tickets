import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout

class SolutionTest {

    private val solution: Solution = Solution()

    @Test
    fun `sum of two points returns correct summed point`() {
        val result = solution.solution(Point(1, 2), Point(3, 4))
        assertEquals(Point(4, 6), result)
    }

    @Test
    fun `throws exception`() {
        throw RuntimeException("Test failed because of some reason")
    }

    @Test
    fun `assertion failed`() {
        assertEquals(1, 2)
    }

    @Timeout(1)
    @Test
    fun `timeout exception`() {
        Thread.sleep(2000)
    }
}