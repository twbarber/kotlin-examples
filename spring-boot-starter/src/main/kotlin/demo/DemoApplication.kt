package demo

@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
	SpringApplication.run(KotlinDemoApplication::class.java, *args)
}