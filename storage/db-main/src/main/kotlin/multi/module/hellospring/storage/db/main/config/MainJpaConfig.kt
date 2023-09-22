package multi.module.hellospring.storage.db.main.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement


@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["multi.module.hellospring.storage.db.main"])
@EnableJpaRepositories(basePackages = ["multi.module.hellospring.storage.db.main"])
internal class MainJpaConfig