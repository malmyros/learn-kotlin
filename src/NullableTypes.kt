fun main() {

    val map = mapOf(1 to "one")
    val result = map[2]
    println(result)

    val regularString = "abc"
    val nullableString: String? = null
    val text: String? = nullableString

    if (text != null) {
        println(text.length)
    }

    val dog = Dog("j", 2)
    val nullableDog: Dog? = null
}

data class Dog(
    val name: String,
    val age: Int
)