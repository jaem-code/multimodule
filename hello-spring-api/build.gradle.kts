
dependencies {
	implementation(project(":domain"))
	implementation(project(":support:logging"))
	runtimeOnly(project(":storage:db-main"))

	implementation("org.springframework.boot:spring-boot-starter-web")
}