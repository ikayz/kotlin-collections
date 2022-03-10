fun main() {
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    // Add single pasta items
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add multiple pasta items
    val pasta = listOf("ravioli", "lasagna", "fettuccine")
    println("Add more pasta: {${entrees.addAll(pasta)}}")
    println("Entrees: $entrees")

    // Remove by element
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")

    // Remove by index
    println("Remove noodles by index: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    entrees.clear()
    println("Entrees: $entrees")
}