package my

fun main() {

    val name = "Michail"
    println(name.h1())

    val person = Person("Michail", 36, "Corbetts")
    println(person.info())
    println(person.addressInfo())
}

fun String.h1(): String {
    return "<h1>${this}</h1>"
}

class Person(
    private val name: String,
    private val age: Int,
    val address: String
) {

    fun info() = "My name is $name and I am $age"
}

fun Person.addressInfo() = "My address is $address"