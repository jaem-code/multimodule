package multi.module.hellospring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@EntityScan(basePackages = ["multi.module.hellospring"])
@SpringBootApplication(
	scanBasePackages = [
		"multi.module.hellospring",
	])
class HelloSpringApplication

fun main(args: Array<String>) {
	runApplication<HelloSpringApplication>(*args)
}
