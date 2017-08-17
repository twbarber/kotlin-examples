package demo

class DemoService() {

	/**
	 * See: [Kotlin Getters & Setters](https://kotlinlang.org/docs/reference/properties.html#getters-and-setters)
	 * for more information regarding Getters & Setters
	 *
	 *  @returns [Int] Value of counter
	 */
	var counter: Int = 0
		private set

	private var repo: Repo = DemoRepo()
	private var serv: Service = Service()

	constructor(repo: Repo, serv: Service) : this() {
		this.repo = repo
		this.serv = serv
	}

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

	fun foo() : Int {
		return repo.foo()
	}

	fun bar() : Int {
		return serv.bar()
	}

}