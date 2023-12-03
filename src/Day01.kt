fun main() {
    val input = readInput("Day01")
    var answer = 0
    for (line in input) {
        val digits = line.filter { it.isDigit() }
        val number = "" + digits.first() + digits.last()
        answer += number.toInt()
    }
    answer.println()
}
