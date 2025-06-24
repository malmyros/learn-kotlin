sealed interface NetworkStatus

data object Available : NetworkStatus
data object Unavailable : NetworkStatus
data object Limited : NetworkStatus
data object Unknown : NetworkStatus

class NetworkCheck {
    private lateinit var status: NetworkStatus
    fun isAvailable(): Boolean {
        return when (status) {
            is Available -> true
            is Unavailable -> false
            is Limited -> false
            is Unknown -> false
        }
    }
}

sealed interface KVehicle {
    fun drive()
}

enum class CarType : KVehicle {
    AUDI {
        override fun drive() {
            println("Driving AUDI")
        }
    },
    SUV {
        override fun drive() {
            println("Driving SUV")
        }
    }
}

fun parseVehicle(vehicle: KVehicle) {
    when (vehicle) {
        CarType.AUDI -> {}
        CarType.SUV -> {}
    }
}