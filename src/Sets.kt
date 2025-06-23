fun main() {

    val mySet = setOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    println(mySet)

    val mutableSet = mutableSetOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    println(mutableSet)

    println(mySet.contains(2))
    println(2 in mySet)
    println(mySet.containsAll(listOf(1, 2, 3, 4, 5)))

    println(mySet subtract setOf(2))
    println(mySet intersect setOf(1))
    println(mySet union  setOf(6,7,8,9))

    val myList = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    println(myList)
    println(myList.toSet())
    println(myList.distinct())
}