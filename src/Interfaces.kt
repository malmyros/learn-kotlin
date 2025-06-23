fun main() {

    val myDog = MyDog()
    println(myDog.speak())
    println(myDog.walk())

    val myCat = MyCat()
    println(myCat.speak())
    println(myCat.walk())

    val myFunAnimal = MyFunAnimal()
    println(myFunAnimal.eyeColor())

    val myFunAnimal2 = FunAnimal { "Yellow " }
    println(myFunAnimal2.eyeColor())
}

class MyDog : MyAnimal {
    override val legs: Int
        get() = 4

    override fun speak(): String {
        return "Woof!"
    }

    override fun walk(): Int {
        var steps = 0
        for (step in 1..30 step 2) {
            steps += step
        }
        return steps
    }
}

class MyCat : MyAnimal {
    override val legs: Int
        get() = 4

    override fun speak(): String {
        return "Meow!"
    }

}

interface MyAnimal {

    val legs: Int
    val color: String get() = "Black"

    fun speak(): String

    fun walk(): Int {
        var steps = 0
        for (step in 1..20 step 2) {
            steps += step
        }
        return steps
    }
}

class MyFunAnimal : FunAnimal {

    override fun eyeColor(): String {
        return "Black"
    }

}

fun interface FunAnimal {

    fun eyeColor(): String
}