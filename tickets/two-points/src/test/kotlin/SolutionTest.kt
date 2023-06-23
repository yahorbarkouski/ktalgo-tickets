import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout

class SolutionTest {

    private val solution: Solution = Solution()

    @Test
    fun `throws exception`() {
        throw RuntimeException("Test failed because of some reason")
    }

    @Test
    @Timeout(1)
    fun `timeout exception`() {
        Thread.sleep(2000)
    }
}
