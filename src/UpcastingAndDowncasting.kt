fun main() {

    val dog = SDog("Dog")
    val cat = SCat("Cat")
    val dog2 = SDog("Dog2")
    val cat2 = SCat("Cat2")

    getAnimal(dog)
    getAnimal(cat)

    getAnimal2(dog)
    getAnimal2(cat)

    getAnimal3(dog)
    getAnimal3(cat)

    getAnimal4(dog)
    getAnimal5(cat)

    val animals = listOf(dog, cat, dog2, cat2)
    val result = animals.find { it is SDog } as? SDog
    println(result?.name)
    result?.fetchABall()

    val result2 = animals.filterIsInstance<SDog>()
    result2.forEach { println(it.name) }
}

fun getAnimal(sAnimal: SAnimal) {
    sAnimal.eat()
}

fun getAnimal2(sAnimal: SAnimal) {
    if (sAnimal is SDog) {
        sAnimal.fetchABall()
    }

    if (sAnimal is SCat) {
        sAnimal.scratch()
    }
}

fun getAnimal3(sAnimal: SAnimal) {
    when (sAnimal) {
        is SDog -> sAnimal.fetchABall()
        is SCat -> sAnimal.scratch()
    }
}

fun getAnimal4(sAnimal: SAnimal) {
    val dog = sAnimal as SDog
    dog.fetchABall()
}

fun getAnimal5(sAnimal: SAnimal) {
    val dog = sAnimal as? SDog
    dog?.fetchABall()
}

interface SAnimal {
    fun eat()
    fun run()
}

class SDog(val name: String) : SAnimal {

    override fun eat() {
        println("${this::class.qualifiedName} is eating")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running")
    }

    fun fetchABall() {
        println("Fetching a ball!")
    }
}

class SCat(val name: String) : SAnimal {

    override fun eat() {
        println("${this::class.qualifiedName} is eating")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running")
    }

    fun scratch() {
        println("Scratching with claws!")
    }
}