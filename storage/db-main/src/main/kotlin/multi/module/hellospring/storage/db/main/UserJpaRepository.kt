package multi.module.hellospring.storage.db.main

import org.springframework.data.jpa.repository.JpaRepository


internal interface UserJpaRepository: JpaRepository<UserEntity, Long>