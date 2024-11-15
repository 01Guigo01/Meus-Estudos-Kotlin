class ElectricCar : CarActions {
    override fun accelerate() {
        println("O carro elétrico está acelerando silenciosamente.")
    }

    override fun brake() {
        println("O carro elétrico está freando com sistema de regeneração.")
    }
}