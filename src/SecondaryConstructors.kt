fun main() {

    val myP = MyP("Michail")
    val myP2 = MyP("John", 2)
}

class MyP(
    val name: String,
    val age: Int = 0,
    val isMale: Boolean = false
) {

    init {
        println("Initializing: My name is $name")
    }

    init {
        println("Initialized")
    }

    constructor(
        name: String,
        age: Int
    ) : this(name, age, false) {
        println("Secondary constructor")
    }

//    fun printName() {
//        println("My name is $name")
//    }
}