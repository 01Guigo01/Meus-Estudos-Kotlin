// Main.kt
fun main() {
    val myCar = Car(make = "Toyota", model = "Corolla", currentPassengers = 3)

    println("Current passengers: ${myCar.currentPassengers}")
    myCar.addPassenger() // Deve adicionar um passageiro
    myCar.addPassenger() // Deve adicionar outro passageiro
    myCar.addPassenger() // Não deve permitir adicionar, pois atinge o máximo
}