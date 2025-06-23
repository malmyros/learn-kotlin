fun main() {

    val child = Child("Michail")
    println(child.color)

    child.updateColor("Yellow")
    println(child.color)
}

open class Parent(val name: String) {
    protected var energy: Int = 0
    open var color: String = "Black"

    fun printEnergy() {
        println(energy)
    }

    fun eat() {
        energy += 1
    }

    open fun run() {
        energy -= 1
    }
}

class Child(val dogName: String) : Parent(name = dogName) {

    override fun run() {
        energy -= 20
    }
}

fun Parent.updateColor(color: String) {
    this.color = color
}