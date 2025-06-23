import kotlin.random.Random

fun main() {
    val numbers = listOf(1, 2, 3)
    val quotedNumbers = numbers.map({ number -> "\"$number\"" })
    println(numbers)
    println(quotedNumbers)

    val quotedNumbers2 = numbers.joinToString(separator = "-", transform = { number -> number.toString() })
    println(quotedNumbers2)

    val quotedLambda = { number: Int -> "\"$number\"" }
    val quotedNumbers3 = numbers.joinToString(transform = quotedLambda)
    println(quotedNumbers3)

    val quotedLambda2 = numbers.mapIndexed { _, number ->
        {
            "$number"
        }
    }

    button { button { println("Button clicked") } }
    button2 { random -> "$random" }
}

fun button(onClick: () -> Unit) {
    onClick()
}

fun button2(onClick: (Int) -> String) {
    onClick(Random.nextInt(from = 0, until = 9))
}