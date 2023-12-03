fun main() {
    val input = readInput("Day01Part2")
    var answer = 0
    val digitByWord = mutableMapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9,
        "1" to 1,
        "2" to 2,
        "3" to 3,
        "4" to 4,
        "5" to 5,
        "6" to 6,
        "7" to 7,
        "8" to 8,
        "9" to 9,
    )
    for (line in input) {
        var actual = 0
        for (i in line.indices) {
            var found = false
            for ((word, number) in digitByWord) {
                if (i + word.length > line.length) continue
                if (word == line.substring(i, i + word.length)) {
                    actual = number * 10
                    found = true
                    break
                }
            }
            if (found) break
        }
        for (i in line.indices.reversed()) {
            var found = false
            for ((word, number) in digitByWord) {
                if (i + word.length > line.length) continue
                if (word == line.substring(i, i + word.length)) {
                    actual += number
                    found = true
                    break
                }
            }
            if (found) break
        }
        println(line)
        println(actual)
        answer += actual
    }
    answer.println()
}
