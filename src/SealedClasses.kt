fun main() {

}

sealed class BVehicle

data class BCar(
    val manufacturer: String,
    val model: String
) : BVehicle()

data class BBicycle(
    val manufacturer: String,
) : BVehicle()

data class Tv(
    val manufacturer: String,
) : BVehicle()

fun getVehicle(vehicle: BVehicle): String = when (vehicle) {
    is BCar -> vehicle.manufacturer
    is BBicycle -> vehicle.manufacturer
    is Tv -> vehicle.manufacturer
}


sealed class KAnimal {

    val legs: Int = 4

    abstract val name: String

    abstract fun eat(): String
}