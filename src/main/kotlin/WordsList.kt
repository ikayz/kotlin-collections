fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    val filteredWords = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
    println(filteredWords)
}