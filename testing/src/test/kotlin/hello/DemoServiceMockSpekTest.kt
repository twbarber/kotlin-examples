package hello

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DemoServiceMockSpekTest : Spek({

	given("The service was instantiated correctly with default Components") {

		val service = DemoService()

		it("Should instantiate without args with a default Counter value of 0") {
			assertNotNull(service)
			assertEquals(1, service.foo())
		}

		it("Counter value should increase by one when decrement is called") {
			service.incrementCounter()
			assertEquals(100, service.bar())
		}
	}

	given("The service was instantiated correctly with mocked Components") {
		val mockRepo : Repo = mock { on { foo() } doReturn 42 }
		val mockService : Service = mock { on { bar() } doReturn 9999 }
		val service = DemoService(mockRepo, mockService)

		it("Should instantiate without args with a default Counter value of 0") {
			assertNotNull(service)
			assertEquals(42, service.foo())
		}

		it("Counter value should increase by one when decrement is called") {
			service.incrementCounter()
			assertEquals(9999, service.bar())
		}
	}

})