package t

fun main() {

}

fun person(name: String) {}
fun person(name: Char) {}

class Person {

    fun getName(name: String): String {
        return name
    }
}

fun Person.getName2(name: String) = name