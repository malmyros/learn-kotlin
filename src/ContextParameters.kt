data class Problem(val reason: String)

interface Semigroup<A> {
    fun combine(x: A, y: A): A
}

val problemSemigroup: Semigroup<Problem> = object : Semigroup<Problem> {
    override fun combine(x: Problem, y: Problem): Problem {
        return Problem("${x.reason}, ${y.reason}")
    }
}

context(s: Semigroup<A>)
fun <A> combineAll(list: List<A>): A? {
    return list.reduceOrNull { acc, item -> s.combine(acc, item) }
}

fun main() {
    val problems = listOf(
        Problem("Service timed out"),
        Problem("Database connection lost"),
        Problem("Disk is full"),
    )

    val combineProblems = with(problemSemigroup) {
        combineAll(problems)
    }

    println(combineProblems)
}