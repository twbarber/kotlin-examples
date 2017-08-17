package demo

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert
import org.junit.Test

class DemoServiceMockJUnitTest {

	/**
	 * See:
	 *
	 *  https://github.com/nhaarman/mockito-kotlin/wiki/Mocking-and-verifying
	 *
	 * For information regarding Mockito Kotlin Syntax
	 */
	private val mockRepo : Repo = mock {
		on { foo() } doReturn 42
	}
	// val mockRepoNoTypeInfer = mock<DemoRepo>()

	private val mockService : Service = mock {
		on { bar() } doReturn 9999
	}

	@Test
	fun `Default Repo Foo Returns 1`() {
		val service = DemoService()
		Assert.assertEquals(1, service.foo())
	}

	@Test
	fun `Mock Repo Foo Returns 42`() {
		val service = DemoService(mockRepo, mockService)
		Assert.assertEquals(9999, service.bar())
	}

}