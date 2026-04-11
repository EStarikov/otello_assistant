import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SampleTest {

    @Test
    fun `test that always passes`() {
        assertTrue(true)
    }

    @Test
    fun `hello world test`() {
        val message = "Hello, World!"
        assertEquals("Hello, World!", message)
    }
}