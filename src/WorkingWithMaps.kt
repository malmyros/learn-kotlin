import java.awt.image.TileObserver

fun main() {
    
    val first = listOf("a", "b", "c", "d")
    val second = listOf(1, 2, 3, 4)
    val people = first.zip(second) { name, age -> Till(name, age) }

    val map: Map<Int, List<Till>> = people.groupBy(Till::age)
    println(map)

    val map2 = people.associateWith(Till::name)
    println(map2)

    val map3 = people.associateBy(Till::name)
    println(map3)

    println(map3.getOrElse("r") { "Unknown" })
    println(map3.toMutableMap().getOrPut("l") { Till("l", 23) })
}

data class Till(
    val name: String,
    val age: Int,
)