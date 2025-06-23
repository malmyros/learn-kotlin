fun main() {

    val animals = mapOf(
        "key" to "value",
        "key2" to "value312311",
        "key3" to "value31231",
        "key4" to "value2131"
    )

    println(animals)
    println(animals["key"])
    println(animals["test"])

    val keys = animals.keys
    println(keys)
    val values = animals.values
    println(values)

    for (entry in animals.entries) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value) in animals) {
        println(key)
        println(value)
    }

    animals.forEach { (key, value) ->
        {
            println(key)
            println(value)
        }
    }

    println(animals.getOrDefault("test", "black"))

    val filteredMap = animals.filter { it.value.length > 5 }
    println(filteredMap)

    val animalList = listOf("monkey", "donkey", "cat")
    println(animalList.associateBy { it })

    val monkey = Animal("monkey", 2)
    val tiger = Animal("tiger", 4)
    val whale = Animal("whale", 6)

    val newAnimalList = listOf(monkey, whale, tiger)
    val animalMap = newAnimalList.associateBy({ it.name }, { it.age })
    println(animalMap)
}

open class Animal(
    val name: String,
    val age: Int,
)