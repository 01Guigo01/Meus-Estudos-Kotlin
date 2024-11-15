class Car(val brand: String, var speed: Int) {

    fun getBrand(): String {
        return brand
    }

    fun increaseSpeed(increment: Int): Int {
        speed += increment
        return speed
    }
}
