package chap04

open class User(val nickname: String,
           val isSubscribed: Boolean = true)

class TwitterUser(nickname: String) : User(nickname)

class Secretive private constructor() {}

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)

    val bob = User("Bob", false)
    println(bob.isSubscribed)

    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)

    // val secretive = Secretive() // cannot access private constructor
}
