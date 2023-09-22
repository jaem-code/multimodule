package multi.module.hellospring.controller

import multi.module.hellospring.domain.user.User

data class UserResponse(
    val name: String
) {
    constructor(user: User) : this(user.name)
}