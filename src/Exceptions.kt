fun main() {
//    errorCode()
//    println(averageSalary(3000, 12))
//    println(averageSalaryOrNull(3000, 0))
    println(averageSalaryOrException(3000, 0))
}

fun errorCode() {
    val invalidNumber = "#1"
    val result = invalidNumber.toInt()
    println(result)
}

fun averageSalary(amount: Int, months: Int): Int {
    return amount / months
}

fun averageSalaryOrNull(amount: Int, months: Int) =
    if (amount == 0 || months == 0) null else amount / months

fun averageSalaryOrException(amount: Int, months: Int): Int {
    if (amount == 0) {
        throw IllegalArgumentException("Passed invalid amount $amount value")
    } else if (months == 0) {
        throw IllegalArgumentException("Passed invalid months $months value")
    }

    return amount / months
}