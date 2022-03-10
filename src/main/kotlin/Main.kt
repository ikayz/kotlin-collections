fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")
    println("Size: ${numbers.size}")

    // Access elements in a list
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    // Check if the list contains elements using the contain method
    println("Contains 4: ${numbers.contains(4)}")
    println("Contains 7: ${numbers.contains(8)}")

    // Sorting lists
    println("Sorted reversed: ${numbers.reversed()}")
    println("Sorted: ${numbers.sorted()}")
}