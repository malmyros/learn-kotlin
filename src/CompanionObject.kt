fun main() {

    val example = PhoneExample()
    println(example.result)
    example.callMe()
    println(PhoneExample.callMe2())
    println(PhoneExample.NestedCompanion.callMe2())

    val number = MyNumbers()
    val number1 = MyNumbers()

    number.increment()
    number1.increment()
    number.increment()

    println(MyNumbers.number)
}

class PhoneExample {

    var result = callMe2()

    fun callMe() {
        println("Calling a function")
    }

    companion object NestedCompanion {
        fun callMe2() = "Calling a nested object function"
    }
}

class MyNumbers {

    companion object {
        var number = 0
    }

    fun increment() {
        number++
    }
}