fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    val moreThanTwo: (Int) -> Boolean = { it > 2 }
    println(numbers.any(moreThanTwo))

    repeat(2, { index -> println(index)})

}