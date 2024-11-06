fun main() {

    val car = Car()
    car.color = "Azul"
    println(car.colorDefault)
    car.startEngine()
    car.accelerate(50)
    car.breake(40)
    car.stopEngine()
}