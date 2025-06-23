fun main() {

    val list = listOf(1, 2, 3, 4)

    println("List---------------")
    list.filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    println("Sequence---------------")
    list.asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)
}

fun Int.isEven(): Boolean {
    println("isEven()")
    return this % 2 == 0
}

fun Int.square(): Int {
    println("square()")
    return this * this
}

fun Int.lessThanTen(): Boolean {
    println("lessThanTen()")
    return this < 10
}