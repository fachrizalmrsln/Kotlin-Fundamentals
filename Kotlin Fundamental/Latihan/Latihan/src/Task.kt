fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val result = if (valueC == null)
        valueA + (valueB - 100)
    else
        valueA + (valueB - valueC)
    return generateResult(result)
}

fun generateResult(result: Int) = result