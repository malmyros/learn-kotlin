fun main() {
    val list1 = List(size = 10, init = { it })
    val list2 = MutableList(size = 10, init = { it })
    println(list1)
    println(list2)

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.filter { number -> number > 5 })
    println(numbers.filterIndexed { index, number -> index == 0 })
    println(numbers.filterNot { number -> number > 5 })

    val numbers2 = listOf(1, 2, null, 4, 5, null, 7, 8, 9, 10)
    println(numbers2.filterNotNull())

    println(numbers.count())
    println(numbers.count { number -> number > 5 })
    println(numbers.find { number -> number == 11 })
    println(numbers.firstOrNull())
    println(numbers.lastOrNull())
    println(numbers.any { number -> number > 5 })
    println(numbers.all { number -> number > 5 })
    println(numbers.none { number -> number > 10 })

    val (match, noMatch) = numbers.partition { number -> number > 5 }
    println(match)
    println(noMatch)

    val randomNumbers = listOf(2, 3, 1, 4, 6, 12, 123)
    println(randomNumbers.sum())
    println(randomNumbers.sorted())
    println(randomNumbers.sortedDescending())

    val gundams = listOf(Gundam(3), Gundam(11), Gundam(7))
    println(gundams.sumOf { gundam -> gundam.age })
    println(gundams.sortedBy { gundam -> gundam.age })

    println(numbers.take(n = 3))
    println(numbers.drop(n = 3))
}

data class Gundam(val age: Int)