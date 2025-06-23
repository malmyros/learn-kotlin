fun main() {

    val priority = Priority.MEDIUM
    println(priority.name)
    println(priority.type)
    println(priority.isLow())
    println(priority.isMedium())
    println(priority.isHigh())

    println(Priority.valueOf("MEDIUM"))

    for (pr in Priority.entries) {
        println(pr.name)
    }

    println(priority.number)
}

enum class Priority(val type: String) {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    val number: Int
        get() = when (this) {
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }

    fun isLow(): Boolean {
        return this == LOW
    }

    fun isMedium(): Boolean {
        return this == MEDIUM
    }

    fun isHigh(): Boolean {
        return this == HIGH
    }
}