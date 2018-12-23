package chap04

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val counter = LengthCounter()
    println("count: ${counter.counter}")
    // counter.counter = 3 // cannot access private setter
    counter.addWord("Kotlin")
    println("count: ${counter.counter}")
}
