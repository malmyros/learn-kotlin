fun main() {
    start()
    addQuotes()
}

fun start() {

    val builder = StringBuilder()
    fun log(message: String) = builder.appendLine(message)
    log(message = "Status.OK")
    log(message = "Wings..OK")
    log(message = "Engine..Starting..")
    println(builder)
}

fun addQuotes() {
    fun String.quoted() = "\"$this\""
    println("Sisdad".quoted())
}