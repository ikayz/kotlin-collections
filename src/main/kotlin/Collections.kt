fun main() {
    // List
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("List: ${numbers.sorted()}")

    // Set
    val setOfNumbers = numbers.toSet()
    println("Set: $setOfNumbers")

    // Mutable sets
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")

    // Contains 7
    println("Contains 7: ${setOfNumbers.contains(7)}")

    // Map
    val peopleAges = mutableMapOf<String, Int>(
        "Isaac" to 30,
        "Louisa" to 23
    )
    println(peopleAges)
}