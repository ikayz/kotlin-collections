fun main() {
    val triple: (Int) -> Int = {a: Int -> a * 3}
    println(triple(5))

    // Short lambda
    val double: (Int) -> Int = {it * 2}
    println(double(4))

    val peopleNames = listOf("Joana", "James", "Francine", "Vanessa")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
}