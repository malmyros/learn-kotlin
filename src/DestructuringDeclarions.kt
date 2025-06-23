fun main() {

    val pair = Pair(1, "Michail")
    println("${pair.first} ${pair.second}")

    val (first, second) = pair
    println("${first} ${second}")

    val bunny = Bunny("Michail", 2, "addsda")
    val (_, age) = bunny
    println("$age")

    val myMap = mapOf(
        1 to "one",
        2 to "two",
    )

    for ((key, value) in myMap) {
        println("$key -> $value")
    }
}

data class Bunny(
    val name: String,
    val age: Int,
    val address: String
)