fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("List: ${numbers.sorted()}")

    // Convert to a set
    val setOfNumbers = numbers.toSet()
    println("Set: $setOfNumbers")

    // Mutable sets
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)


}