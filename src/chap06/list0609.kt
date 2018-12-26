package chap06

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"

    // sendEmailTo(email) -> Type mismatch
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }
}
