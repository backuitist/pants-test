package pants

import org.junit.Test

class HelloTest {

    @Test
    def sayIt() : Unit = {
        println("Testing hello.sayIt : " + Hello.sayIt)
    }
}