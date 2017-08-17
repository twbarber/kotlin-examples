package demo

class DemoService {

	/**
	 * See:
	 *
	 *  https://kotlinlang.org/docs/reference/properties.html#getters-and-setters
	 *
	 * For more information regarding Getters & Setters
	 *
	 *  @returns [Int] Value of counter
	 */
	var counter: Int = 0
		private set

	/** Reset [counter] to 0 **/
	fun resetCounter() {
		this.counter = 0
	}

	/**
	 * Add 1 to [counter].
	 */
	fun incrementCounter() {
		this.counter += 1
	}

	/**
	 * Subtract 1 from [counter].
	 */
	fun decrementCounter() {
		this.counter -= 1
	}

}