fun main() {
    val guestsPerFamily = listOf(2, 4, 1, 5)
    var totalGuests = 0
    var index = 0

    // While loop
    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }

    println("Total Guest Count: $totalGuests")

    // For loop
    val names = listOf("James", "John", "Wendy", "Belle")

    for (name in names) {
        println("$name - Number of characters ${name.length}")
    }

}