fun main() {

    val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    println(numbers.take(3))
    println(countOccurrences(numbers, 3))

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(3)
    println(mutableList)
}

fun countOccurrences(numbers: List<Int>, target: Int): Int {
    var occurrences = 0
    for (number in numbers) {
        if (number == target) {
            occurrences++
        }
    }
    return occurrences
}