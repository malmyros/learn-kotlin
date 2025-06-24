fun main() {
    Singleton.printName()
    increment()
    println(Counter.currentCount())

    James.printName()
}

open class Gib(private val name: String) {
    open fun printName() {
        println("My name is $name")
    }
}

interface Worker {
    fun getToWork()
}

object James: Gib(name = "Michail"), Worker {

    override fun getToWork() {
        TODO("Not yet implemented")
    }
}

object Singleton {

    fun printName() {
        println("Hi my name is Michail")
    }
}

object Counter {
    private var count = 0

    fun currentCount() = count

    fun increment() {
        count++
    }
}

fun increment() {
    Counter.increment()
}

object OuterObject {

    object NestedObject {

    }
}

class OuterClass {
    object NestedObject {

    }
}