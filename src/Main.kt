fun main() {

    val elements = listOf("A", "B")
    for (number in 1..3) {
        println("$number")
    }


    val range1 = 1..10
    val range2 = 10 until 20
    println(range1)
    println(range2)

    showRange(1..2)
    showRange(range = 3 downTo 2)
    showRange(range = 0..10 step 2)

    for (letter in 'a'..'z') {
        println(letter)
    }

    var character: Char = 'a'
    println(character + 25)


    repeat(10) {
        println("Kotlin is the best!")
    }
}

fun showRange(range: IntProgression) {
    for (number in range) {
        println("$number")
    }
}
