package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	SpringApplication.run(DemoApplication::class.java, *args)
}

@RestController
class HelloController {

	@GetMapping("/hello")
	fun helloKotlin(): String {
		return "hello world"
	}
}