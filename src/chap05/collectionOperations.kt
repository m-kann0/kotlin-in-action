package chap05.collection.operations

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })
    println(!list.all { it == 3 })
    println(list.any { it != 3 })

    val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("Carol", 31))
    println(people.filter { it.age > 30 })
    println(people.map { it.name })
    println(people.map(Person::name))
    println(people.filter { it.age > 30 }.map(Person::name))
    println(people.filter { it.age == people.maxBy(Person::age)?.age })
    val maxAge = people.maxBy(Person::age)?.age
    println(people.filter { it.age == maxAge })
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27))
    println(people.groupBy { it.age })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

    val words = listOf("a", "ab", "b")
    println(words.groupBy(String::first))
}
