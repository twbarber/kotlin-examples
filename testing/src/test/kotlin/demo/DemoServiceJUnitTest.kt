package demo

import org.junit.Assert.*
import org.junit.Test

class DemoServiceJUnitTest {

	@Test
	fun testCanSetValue() {
		val service = DemoService()
		assertEquals(0, service.counter)
	}

}