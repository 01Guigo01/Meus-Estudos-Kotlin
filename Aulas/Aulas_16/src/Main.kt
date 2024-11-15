// Main.kt
fun main() {
    val electricCar: CarActions = ElectricCar()
    val gasCar: CarActions = GasCar()

    electricCar.accelerate() // "O carro elétrico está acelerando silenciosamente."
    electricCar.brake() // "O carro elétrico está freando com sistema de regeneração."

    gasCar.accelerate() // "O carro a gasolina está acelerando com som de motor."
    gasCar.brake() // "O carro a gasolina está freando com sistema hidráulico."
}
