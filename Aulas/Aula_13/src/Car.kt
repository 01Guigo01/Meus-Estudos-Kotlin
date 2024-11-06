class Car(color: String, brand: String, model: String, year: Int) {


    var color: String? = null
    var brand: String? = null
    var model: String? = null
    var year: Int? = null

    init {
        this.color = color
        this.brand = brand
        this.model = model
        this.year = year
    }

    fun detailsCar(){
        println("Cor: $color " +
                "\nMarca: $brand" +
                "\nModelo: $model" +
                "\nAno: $year")
    }

    /*
        var color: String? = null
        val colorDefault: String
            get() = color ?: "Cor Padrão"
        var weight: Double? = null
        val weightDefault: Double
            get() = weight ?: 0.0
        var height: Double? = null
        val heightDefault: Double
            get() = height ?: 0.0

*/

    var speed: Int = 0
        private set

    fun startEngine(){
        println("O motor foi ligado")
    }

    fun stopEngine(){
        println("O motor foi desligado")
    }

    fun accelerate(increaseBy: Int){
        speed += increaseBy
        println("A velocidade do carro agora é $speed Km/h")
    }

    fun  breake(decreaseBy: Int){
        speed = if(speed - decreaseBy < 0 ) 0 else speed - decreaseBy
        println("A velocidade  do carro agora é $speed Km/h")
    }

}