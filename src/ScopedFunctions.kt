fun main() {

    // let scoped function
    val name: String? = "Michail"
    val length = name?.let {
        println("Name is not null")
        it.length
    } ?: 0
    println("Length is $length")

    // run scoped function
    val aphrodite = Aphrodite("Aphrodite", 30)
    val result = aphrodite.run {
        age = 35
        "Age: $age"
    }
    println(result)


    // with scoped function
    val aphrodite2 = Aphrodite("Aphrodite", 30)
    val result2 = with(aphrodite2) {
        age = 40
        "Age: $age"
    }
    println(result2)

    // apply scoped function
    val aphrodite3 = Aphrodite("Aphrodite", 30)
    val result3 = aphrodite3.apply {
        age = 40
    }
    println(result3)

    // also scoped function
    val numbers = mutableListOf(1, 2, 3)
    val sum = numbers
        .also { println("Original List: $it") }
        .sum()
    println(sum)
}

data class Aphrodite(var name: String, var age: Int)