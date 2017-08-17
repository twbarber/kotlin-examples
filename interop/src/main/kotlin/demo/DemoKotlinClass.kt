package demo

class DemoKotlinClass {

	companion object {
		@JvmStatic fun main(args: Array<String>) {
			val demoJava = DemoJavaClass()
			print(demoJava.helloJava())
			print(demoJava.helloKotlin())
		}
	}

	fun hello() : String? {
		return "Hello, Kotlin"
	}

	fun helloJava() : String {
		val demoJava = DemoJavaClass()
		return demoJava.helloJava()
	}

}

