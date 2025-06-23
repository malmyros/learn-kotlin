fun main() {

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