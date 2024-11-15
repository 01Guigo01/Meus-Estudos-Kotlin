open class Vehicle(
    val typeVehicle: String,
    val color: String,
    val brand: String,
    val model: String,
    val year: Int
) {

    var speed: Int = 0
        private set

    // Bloco init é chamado ao criar a instância do objeto
    init {
        println("Veículo $typeVehicle $brand $model de $year foi criado!")
    }

    fun detailsVehicle() {
        println("Veículo: " +
                "\nTipo: $typeVehicle" +
                "\nCor: $color" +
                "\nMarca: $brand" +
                "\nModelo: $model" +
                "\nAno: $year")
    }

    fun startEngine() {
        println("O motor foi ligado")
    }

    fun stopEngine() {
        println("O motor foi desligado")
    }

    fun accelerate(increaseBy: Int) {
        speed += increaseBy
        println("A velocidade do veículo agora é $speed Km/h")
    }

    fun breake(decreaseBy: Int) {
        speed = if (speed - decreaseBy < 0) 0 else speed - decreaseBy
        println("A velocidade do veículo agora é $speed Km/h")
    }
}
