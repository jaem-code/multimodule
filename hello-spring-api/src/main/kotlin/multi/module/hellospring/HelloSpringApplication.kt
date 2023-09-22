package multi.module.hellospring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication(
	scanBasePackages = [
		"multi.module.hellospring.domain",
		"multi.module.hellospring.storage",
	])
class HelloSpringApplication

fun main(args: Array<String>) {
	runApplication<HelloSpringApplication>(*args)
}
