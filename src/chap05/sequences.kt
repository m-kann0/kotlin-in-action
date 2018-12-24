package chap05.sequences

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31),
        Person("Carol", 28)
    )
    println(people.map(Person::name).filter { it.startsWith("A") })
    println(
        people.asSequence()
            .map(Person::name)
            .filter { it.startsWith("A") }
            .toList()
    )

    println(
        listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0}
    )

    println(
        listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0}
            .toList()
    )
    println(listOf(1, 2, 3, 4).asSequence().map { print("map($it) "); it * it }.find { it > 3 })
}
