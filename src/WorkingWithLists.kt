fun main() {

    val first = listOf("a", "b", "c", "d")
    val second = listOf(1, 2, 3, 4)
    println(first.zip(second))
    println(first.zip(0..10))
    println((10..100).zip(second))

    val ids = listOf(1, 2, 3)
    val names = listOf("dog", "cat", "fish")
    val result = ids.zip(names) {
        id: Int, name: String -> Vampire(name, id)

    }
    println(result)

    val number = mapOf(1 to "one", 2 to "two", 3 to "three")
    val (numbers, text) = number.toList().unzip()
    println(numbers)
    println(text)

    val list = listOf(
        listOf("one", "two", "three"),
        listOf("one", "two", "three"),
        listOf("one", "two", "three"),
        listOf("one", "two", "three"),
    )

    println(list.flatten())
}

data class Vampire(val name: String, val age: Int)