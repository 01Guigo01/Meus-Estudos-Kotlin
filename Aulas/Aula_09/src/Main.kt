/*fun main() {
    var counter = 1

    while (counter <= 5) {
        println("Número: $counter")
        counter++  // Incrementa o contador em 1
    }
}*/

fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)
    var index = 0

    while (index < numbers.size) {
        println("Number: ${numbers[index]}")
        index++
    }
}

