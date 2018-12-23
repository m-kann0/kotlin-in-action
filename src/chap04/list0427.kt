package chap04.list0427

class Person(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Person = Person("...")
    }
}

fun main(args: Array<String>) {
    val person = Person.Loader.fromJSON("{name: 'Dmitry'}")
    val person2 = Person.fromJSON("{name: 'Brent'}")
    println(person2.name)
}
