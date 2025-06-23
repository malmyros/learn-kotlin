import kotlin.random.Random

fun main() {

    val result = when (Random.nextInt(from = 0, until = 5)) {
        0 -> "Zero"
        1 -> "One"
        2 -> "Two"
        else -> "Unknown"
    }

    println(result)

    when (getPerson()) {
        is Someone.Male -> println("My name is male")
        is Someone.Female -> println("My name is female")
    }
}

fun getPerson(): Someone {
    return if (Random.nextInt(from = 1, until = 3) == 1) Someone.Male else Someone.Female
}

sealed class Someone {
    object Male : Someone()
    object Female : Someone()
}