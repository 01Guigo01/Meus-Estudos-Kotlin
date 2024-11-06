fun main() {
    val animalType = "dog"

    when (animalType) {
        "cat" -> {
            println("É um gato!")
        }
        "dog" -> {
            println("É um cachorro!")
        }
        "bird" -> {
            println("É um pássaro!")
        }
        else -> {
            println("Tipo de animal desconhecido!")
        }
    }
}
