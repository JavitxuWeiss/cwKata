import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*


internal class MainKtTest {

    @Test
    fun productFib() {
        println("Fixed Tests")
        assertEquals("[55, 89, 0]",Arrays.toString(productFib(4895)))
    }

    @Test
    fun test() {
        println("Fixed Tests")
        assertEquals("[101, 103]", Arrays.toString(gap(2, 100, 110)))
        assertEquals("[103, 107]", Arrays.toString(gap(4, 100, 110)))
        assertEquals("[]", Arrays.toString(gap(11,30000,100000)))
        assertEquals("[348239, 348241]", Arrays.toString(gap(2, 348200, 448241)))
    }
    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }
    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }
    @Test
    fun BasicTests() {
        println("****** Basic Tests ******")
       // assertEquals("2000 103 123 4444 99", orderWeight(" 103 123  4444 99 2000 "))
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"))

    }
}

