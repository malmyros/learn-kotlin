import java.io.File

fun main() {
    val solution = Solution(name = "Michail", age = 25)
    println(solution.name)
    println(solution.age)
    println(multiplyWithTen(20))
    writeToFile()
}



fun writeToFile() {
    val myFile = File("MyFile.txt")
    check(value = myFile.exists()) {
        "${myFile.name} does not exist."
    }
    myFile.writeText("Everything is ok")
}

fun multiplyWithTen(number: Int?): Int {
    require(value = number != null, lazyMessage = { "Please enter a valid number" })
    return number * 10
}

data class Solution(
    val name: String,
    val age: Int
) {

    init {
        require(value = name.length < 10, lazyMessage = { "Name must be more than zero." })
    }
}