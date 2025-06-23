fun main() {

    val freelancer = Freelancer()
    freelancer.work()
    freelancer.getPaid()

    val freelancer2 = Freelancer2(programmer = KotlinProgrammer(amount = 200))
    freelancer2.work()
    freelancer2.getPaid()

    val freelancer3 = Freelancer3()
}

interface Programmer {
    var working: Boolean
    fun work()
    fun getPaid()
}

interface Designer {
    var designing: Boolean
    fun design()
}


class KotlinProgrammer(val amount: Int) : Programmer {

    override var working: Boolean = false

    override fun work() {
        println("Working with Kotlin!")
        working = true
    }

    override fun getPaid() {
        if (working) {
            println("Getting paid for $$amount!")
        } else {
            println("No money, you need to work first!")
        }
        working = false
    }
}

class GraphicDesigner : Designer {
    override var designing: Boolean = false

    override fun design() {
        println("Designing with Graphic!")
    }

}

class Freelancer : Programmer by KotlinProgrammer(amount = 100)

class Freelancer2(programmer: Programmer) : Programmer by programmer {

    override fun getPaid() {
        println("You are not getting paid this month!")
    }
}

class Freelancer3:
    Programmer by KotlinProgrammer(amount = 200),
    Designer by GraphicDesigner()

