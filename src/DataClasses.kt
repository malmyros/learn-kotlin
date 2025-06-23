fun main() {

    val book = Book("Foundations of Economics", 20)
    val book2 = Book("Foundations of Economics", 20)
    println(book.equals(book2))


    val book3 = book.copy("Test")
    println(book3)

    val (name, age) = book
    println("$name, $age")
}

data class Book(
    val name: String,
    val age: Int) {
}