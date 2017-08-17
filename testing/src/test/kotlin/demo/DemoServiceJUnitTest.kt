package demo

import org.junit.Assert.*
import org.junit.Test

class DemoServiceJUnitTest {

	@Test
	fun `Default Value of Counter is 0`() {
		val service = DemoService()
		assertEquals(0, service.counter)
	}

	@Test
	fun `Decrement Counter Increases Value by 1`() {
		val service = DemoService()
		assertEquals(0, service.counter)
		service.incrementCounter()
		assertEquals(1, service.counter)
	}

	@Test
	fun `Decrement Counter Decreases Value by 1`() {
		val service = DemoService()
		assertEquals(0, service.counter)

		service.incrementCounter()
		service.incrementCounter()
		assertEquals(2, service.counter)

		service.decrementCounter()
		assertEquals(1, service.counter)
	}

	@Test
	fun `Resetting Counter Sets Value to 0`() {
		val service = DemoService()
		assertEquals(0, service.counter)

		service.incrementCounter()
		assertEquals(1, service.counter)

		service.resetCounter()
		assertEquals(0, service.counter)
	}
}