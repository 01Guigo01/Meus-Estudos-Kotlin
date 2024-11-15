fun main() {
    // Criando uma instância da classe Car
    val car = Car("Toyota", 50)

    // Usando o método getBrand
    println("Brand: ${car.getBrand()}")

    // Usando o método increaseSpeed
    println("Speed after increase: ${car.increaseSpeed(20)}") // Aumenta a velocidade em 20
}
