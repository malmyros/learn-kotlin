import Airport.Plane

fun main() {

    val airport = Airport(code = "GB")
    val plane = Plane()
    plane.contact(airport)

    val privatePlane = airport.privatePlane()
    airport.myFunction()

    val ticket = Ticket("Michail", Ticket.Seat.ECO)
    ticket.printSeat()
    ticket.upgrade()
    ticket.printSeat()
}

class Airport(private val code: String) {

    open class Plane() {

        fun contact(airport: Airport) {
            println(airport.code)
        }
    }

    private class PrivatePlane() : Plane() {
        fun secretCode() {
            println("secretCode")
        }
    }

    fun privatePlane(): Plane = PrivatePlane()
    private fun privatePlaneSecretCode(privatePlane: PrivatePlane) {
        println(privatePlane.secretCode())
    }

    class Example {
        val airport: Airport = Airport("GB")
        val plane = Plane()
    }

    fun myFunction() {

        open class MyProgrammer()
        open class Kotlin : MyProgrammer()

        val programmer: MyProgrammer = Kotlin()
    }
}

interface PersonInterface {

    val height: Height

    data class Height(val cm: Int)
}

class John : PersonInterface {

    override val height: PersonInterface.Height
        get() = PersonInterface.Height(100)
}

class Ticket(
    private val name: String,
    private var seat: Seat,
) {

    enum class Seat {
        ECO,
        PREMIUM,
        BUSINESS,
        FIRST
    }

    fun upgrade() {
        seat = Seat.entries.toTypedArray()[seat.ordinal + 1]
    }

    fun printSeat() {
        println("Hi $name, your seat is: $seat")
    }
}

