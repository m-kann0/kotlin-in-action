package chap06

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}

fun main(args: Array<String>) {
    // printHashCode(null)
    printHashCode(42)
}
