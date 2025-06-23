fun main() {

    val list = listOf(1, 10, 100, 1000)
    val result = list.fold(initial = 0) { acc, i ->
        println("Initial: $acc, i: $i")
        acc + i
    }
    println(result)

    foldReplica()

    val result2 = list.foldRight(initial = 0) { acc: Int, i: Int ->
        println("Initial: $acc, i: $i")
        acc + i
    }
    println(result2)

    val result3 = list.reduce { acc, i ->
        println("Initial: $acc, i: $i")
        acc + i
    }
    println(result3)

    val result4 = list.runningFold(initial = 1) { acc, i ->
        println("Initial: $acc, i: $i")
        acc + i
    }
    println(result4)
}

fun foldReplica() {
    val list = listOf(1, 10, 100, 1000)
    var accumulator = 0
    val operation = { sum: Int, number: Int -> sum + number }
    for (number in list) {
        accumulator = operation(accumulator, number)
    }
    println(accumulator)
}