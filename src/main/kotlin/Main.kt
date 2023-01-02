import kotlin.math.log10

fun main() {
    var digits: String
    do {
        println("Enter your binary number")
        digits = readln()
    } while (digits.length > 8 || digits.any { it !in '0'.. '1' })

    println("Your decimal number is:")
    calculate(digits)
}


fun calculate(digits: String) {
    var intDigits = digits.toInt()
    val digitsCount = 1 + log10(intDigits * 1.0).toInt()
    var i = 0
    var result = 0
    val base = 2
    while (i < digitsCount) {
        result += Math.pow(base.toDouble(), i.toDouble()).toInt() * (intDigits % 10)
        intDigits /= 10
        i++
    }
    println(result)
}


