fun main() {
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    val pasta = listOf("ravioli", "lasagna", "fettuccine")
    println("Add more pasta: {${entrees.addAll(pasta)}}")
    println("Entrees: $entrees")
}