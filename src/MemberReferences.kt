fun main() {

    val people = listOf(
        Alice("Michail", 2, true),
        Alice("Amarelda", 3, false),
        Alice("Grigoria", 3, false),
    )

    people.filter(Alice::male).forEach { println(it.name) }
    people.filterNot(Alice::male).forEach { println(it.name) }
    people.forEach { alice -> alice.myName() }

    println(people.any(Alice::important))
    println(people.any(::important2))

    val names = listOf("dog", "cat", "fish")
    println(names.mapIndexed(::SomeAnimal))
    println(names.mapIndexed{ index, name -> SomeAnimal(index, name) })
}

fun Alice.important() = this.name.startsWith("M") && this.age > 1

fun important2(alice: Alice) = alice.name.startsWith("M") && alice.age > 1

data class Alice(
    val name: String,
    val age: Int,
    val male: Boolean
) {

    fun myName() = println("My name is $name")
}

data class SomeAnimal(
    val id: Int,
    val name: String
)