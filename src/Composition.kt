fun main() {

    val dog = BDog()
    val cleaningRobot = BCleaningRobot()
    val cleaningRobotDog = CClearingRobotDog(
        dog = dog,
        cleaningRobot = cleaningRobot,
    )

    cleaningRobotDog.move()
    cleaningRobotDog.run()
    cleaningRobotDog.bark()
    cleaningRobotDog.clean()
}

interface BAnimal {
    fun eat() {}
    fun run() {}
}

open class BDog : BAnimal {
    open fun bark() {}

    override fun eat() {
    }

    override fun run() {
    }
}

class BCat : BAnimal {
    fun hiss() {}

    override fun eat() {
    }

    override fun run() {
    }
}

interface BRobot {
    fun move() {}
}

open class BCleaningRobot : BRobot {

    open fun clean() {}

    override fun move() {

    }
}

class BServiceRobot : BRobot {
    fun repair() {}

    override fun move() {
    }
}

class BCleaningRobotDog : BAnimal, BRobot, BDog() {

    override fun eat() {
    }

    override fun run() {
    }

    override fun move() {
    }

    override fun bark() {
    }
}

class CClearingRobotDog(
    private val dog: BDog,
    private val cleaningRobot: BCleaningRobot
) {

    fun run() {
        dog.run()
    }

    fun move() {
        cleaningRobot.move()
    }

    fun bark() {
        dog.bark()
    }

    fun clean() {
        cleaningRobot.clean()
    }
}

class BParent {
    fun getFood() {
        println("I am eating food")
    }
}

class BChild(val parent: BParent) {

    fun getFood() {
        parent.getFood()
    }
}