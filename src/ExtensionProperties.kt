fun main() {

    val name = "test"
    println(name.longOrShort)
    println(name.quoted())
    println(listOf(1, 2, 3).getFirstOrNull)
}

val String.longOrShort: String
    get() = if (this.length > 10) "Long" else "Short"

fun String.quoted(): String = "\"$this\""

val <T> List<T>.getFirstOrNull: T?
    get() = if (isEmpty()) null else this[0]