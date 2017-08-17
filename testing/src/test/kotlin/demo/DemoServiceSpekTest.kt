package demo

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import java.net.URL
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class DemoServiceSpekTest : Spek({

	it("Should have a constructor with no values.") {
		val service = DemoService()
		assertNotNull(service)
	}

})