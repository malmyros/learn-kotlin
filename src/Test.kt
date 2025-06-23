fun main() {

    val myTest = MyTest("Test")
    println(myTest.getName())
    println(myTest.getNickname())
}

class MyTest(private val name: String) {

    private val nickname = "Michail"

    fun getName(): String {
        return name
    }

    fun getNickname(): String {
        return nickname
    }
}