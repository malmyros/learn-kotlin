fun main() {

    val person = Person()
    println(person.age)

    person.age = 25
    println(person.age)

    val acPerson = AcPerson()
    println(acPerson.age)
    println(acPerson.age)
    println(acPerson.age)

    acPerson.age = 25
    println(acPerson.age)
    println(acPerson.isMinor())
}

class AcPerson {
    private var accesses = 0

    var age: Int = 0
        get() {
            ++accesses
            return field
        }
        set(value) {
            field = value
        }

    fun isMinor() = age < 18
}

class Person {

    var age = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

}