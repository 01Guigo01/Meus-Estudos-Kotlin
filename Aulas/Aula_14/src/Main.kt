fun main() {
    val motorcycle = Motorcycle("Moto", "Preta", "Honda", "Bis", 2024)
    val car = Car("Carro", "Verde", "Ford", "Fiesta", 2012)

    motorcycle.detailsVehicle()
    motorcycle.startEngine()
    car.detailsVehicle()
    car.startEngine()
}