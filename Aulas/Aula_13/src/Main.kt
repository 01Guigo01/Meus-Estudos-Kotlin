fun main() {

    val car = Car("Blue", "Ford", "Fiesta", 2024)
    val car2 = Car("Vermelho", "Renault", "Kwid", 2018)
    car.detailsCar()
    car2.detailsCar()
    car.startEngine()
    car.accelerate(50)
}