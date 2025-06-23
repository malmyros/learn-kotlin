fun main() {

    val myArray = intArrayOf(6,8,10)
    println(sum(numbers = intArrayOf(1,2,3,4,5,6,7,8,9)))
    println(sum(numbers = intArrayOf(1,2,3,4,5,6,7,8,9, * myArray)))
}

fun sum(vararg numbers: Int): Int {

    var total = 0
    for (number in numbers) {
        total += number
    }
    return total
}