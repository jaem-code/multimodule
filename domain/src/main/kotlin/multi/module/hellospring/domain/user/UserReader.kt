package multi.module.hellospring.domain.user

import org.springframework.stereotype.Component
import java.util.NoSuchElementException
@Component
class UserReader(
    private val userRepository: UserRepository
) {
    fun read(id: Long): User {
        return userRepository.read(id) ?: throw NoSuchElementException("User with ID $id not found")
    }
}