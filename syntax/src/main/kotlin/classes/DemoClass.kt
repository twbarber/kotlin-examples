package classes

import other.SomeOtherClass

class DemoClass {

	val myInteger = 0
	var myString: String = ""
	val myOtherClass: SomeOtherClass = SomeOtherClass()
	private val myInnerClass = InnerClass()

	fun printMyInt() {
		println(myInteger)
	}

	fun myIntPlusOne() : Int {
		return myInteger + 1
	}

	class InnerClass
}