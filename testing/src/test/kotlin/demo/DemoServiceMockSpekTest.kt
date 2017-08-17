package demo

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DemoServiceMockSpekTest : Spek({

	given("The service was instantiated correctly") {
		val service = DemoService()

		it("Should instantiate without args with a default Counter value of 0") {
			assertNotNull(service)
			assertEquals(0, service.counter)
		}

		it("Counter value should increase by one when decrement is called") {
			service.incrementCounter()
			assertEquals(1, service.counter)
		}

		it("Counter value should decrease by one when decrement is called") {
			service.incrementCounter()
			assertEquals(0, service.counter)
		}

		it("Counter value should reset to 0 when decrement is called") {
			service.incrementCounter()
			assertEquals(1, service.counter)
			service.resetCounter()
			assertEquals(0, service.counter)
		}
	}

})