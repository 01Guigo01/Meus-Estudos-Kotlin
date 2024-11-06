fun main() {
// Itera de 1 a 5, incluindo o 5
    for (number in 1..5) {
        println("Number: $number")
    }

    // Itera de 1 a 10, mas pulando de 2 em 2
    for (number in 1..10 step 2) {
        println("Number: $number")
    }

    // Conta de 5 até 1, de forma decrescente
    for (number in 5 downTo 1) {
        println("Number: $number")
    }

    // Declara uma lista de strings
    val fruits = listOf("Apple", "Banana", "Cherry")

    // Itera sobre cada item na lista
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    val animals = listOf("Cat", "Dog", "Elephant")

    // Itera sobre cada item, obtendo o índice e o valor
    for ((index, animal) in animals.withIndex()) {
        println("Index: $index, Animal: $animal")
    }



}