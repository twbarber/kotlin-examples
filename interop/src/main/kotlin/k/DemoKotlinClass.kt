package k

import j.DemoJavaClass

class DemoKotlinClass : Friendly {

	private val java = DemoJavaClass()

	companion object {
		@JvmStatic fun main(args: Array<String>) {
			val demo = DemoKotlinClass()
            println(demo.hello())
            println(demo.helloJava())
		}
	}

	override fun hello() : String {
		return "Hello, Kotlin"
	}

	private fun helloJava() : String {
		return java.hello()
	}

}

