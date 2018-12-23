package chap04.list0425

class User private constructor(val nickname: String) {

    companion object {
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User(accountId.toString())
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)

    println(subscribingUser.nickname)
    println(facebookUser.nickname)
}
