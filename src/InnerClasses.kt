fun main() {

    val hardDrive = Computer(model = "Mac")
}

open class Computer(private val model: String) {

    abstract inner class HardDrive(private val size: Int) {

        abstract val storageMode: String

        fun getComputerModel() {
            println(this@Computer.model)
        }

        fun getInfo() {
            println("Computer model: $model, HDD Size: $size GB.")
        }

        inner class Storage(private val system: Int = 10) {

            fun getInfo() {
                println("Current capacity: ${this@HardDrive.size - system} GB")
            }
        }
    }
}

class Laptop(
    private val model: String,
    private val hddSize: Int,
    private val storageModel: String
): Computer(model = model) {

    inner class Storage : HardDrive(size = hddSize) {

        override val storageMode: String = this@Laptop.storageModel
    }
}