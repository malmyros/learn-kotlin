fun main() {
//    myErrorCode()
//    function3()
    function4()
}

fun function1() {
    throw CustomException("Some random problem")
}

fun function2() {
    function1()
}

fun function3() {
    function2()
}

fun function4() {
    try {
        function1()
    } catch (e: CustomException) {
        println("Exception caught: ${e.message}")
    } catch (e: MyInvalidNumberException) {
        println("Invalid number: ${e.message}")
    } catch (e: Exception) {
        println("Exception caught: ${e.message}")
    } finally {
        println("Cleanup")
    }
}

fun myErrorCode() {
    throw MyInvalidNumberException("Please enter a valid number")
}

open class MyInvalidNumberException(
    description: String
) : Exception(description)

class CustomException(description: String) : Throwable(description)

class MyEx(description: String) : MyInvalidNumberException(description)