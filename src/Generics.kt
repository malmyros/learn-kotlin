fun main() {

    val car = Car(tires = Tires(17))
    println(car.getValue())

    val car2 = Car(tires = "17")
    println(car2.getValue())

    val vehicle = Vehicle(value = MyCar())
    val car3 = vehicle.getValue()
    println(car3)
    println(car3.start())

    println(getSomeName(1))
}

data class Tires(val size: Int)

class Car<T>(val tires: T) {
    fun getValue(): T = tires
}

class Vehicle<T>(private val value: T) {

    fun getValue(): T = value
}

class MyCar {
    fun start() = "Starting the engine"
}

fun <T> getSomeName(name: T): T = name