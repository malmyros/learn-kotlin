fun main() {

    val male = Male()
    male.printName()
    male.printName("John")
}

abstract class NewAnimal {

    abstract val name: String
    protected var energy = 0

    abstract fun eat()

    open fun speak(): String {
        return "Woof!"
    }
}

class NewDog : NewAnimal() {

    override val name: String
        get() = "Rex"

    override fun eat() {
        energy += 1
    }

    override fun speak(): String {
        return "Roar!"
    }
}

abstract class PersonA(private val name: String) {

    open fun printName() {
        println("Name: $name")
    }
}

interface PersonB {

    fun printName(name: String) {
        println("Name: $name")
    }
}

class Male : PersonA("Male"), PersonB {

    override fun printName() {
        super<PersonA>.printName()
    }

    override fun printName(name: String) {
        super<PersonB>.printName(name)
    }
}