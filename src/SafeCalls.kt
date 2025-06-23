fun main() {

    getName("Michail")
    getName(null)
}

fun getName(name: String?) {
    println(name?.length) // safe call
    println(name?.length ?: 0) // safe call with elvis operator
    println(name!!.length) // unsafe call with double bang operator
}

