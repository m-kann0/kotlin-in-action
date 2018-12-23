package chap04

//class Client(val name: String, val postalCode: Int) {
//    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
//
//    override fun equals(other: Any?): Boolean {
//        if (other == null || other !is Client) {
//            return false
//        }
//        return name == other.name && postalCode == other.postalCode
//    }
//
//    override fun hashCode() = name.hashCode() * 31 + postalCode
//}

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    println(client1)

    val client2 = Client("Alice", 342562)
    println(client1 == client2)

    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))

    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}
