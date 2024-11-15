class Car(
    val make: String,
    val model: String,
    var currentPassengers: Int
) {
    fun canAddPassenger(): Boolean {
        return currentPassengers < MAX_PASSENGERS
    }

    fun addPassenger() {
        if (canAddPassenger()) {
            currentPassengers++
            println("Passenger added! Total passengers: $currentPassengers")
        } else {
            println("Cannot add more passengers. Max is $MAX_PASSENGERS.")
        }
    }
}
