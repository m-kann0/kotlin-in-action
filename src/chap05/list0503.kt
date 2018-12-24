package chap05

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    println(people.maxBy() { p: Person -> p.age })
    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy { p -> p.age })
    val getAge = { p: Person -> p.age }
    println(people.maxBy(getAge))

    println(people.joinToString(separator = " ", transform = { p: Person -> p.name }))
    println(people.joinToString(" ") { p: Person -> p.name })



    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2));
    { println(42) }()
    run { println(42) }

    val sum2 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum2(1, 2))
}
