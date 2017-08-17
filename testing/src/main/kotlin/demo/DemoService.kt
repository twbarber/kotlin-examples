package demo

class DemoService {

	/**
	 * See:
	 *
	 *  https://kotlinlang.org/docs/reference/properties.html#getters-and-setters
	 *
	 * For more information regarding Getters & Setters
	 *
	 *  @returns [Int] Value of [counter]
	 */
	var counter: Int = 0
		private set
		get() {
			return Math.abs(field)
		}

	fun resetCounter() {
		this.counter = 0
	}

	fun incramentCounter() {
		this.counter += 1
	}

	fun decramentCounter() {
		this.counter -= 1
	}

}