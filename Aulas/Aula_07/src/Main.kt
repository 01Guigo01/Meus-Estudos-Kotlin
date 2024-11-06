/*
Operadores Lógicos

&& = E
|| = OU

 */

fun main() {
    var age = 71

    if (age >= 16 && age < 18 || age >= 70){
        println("Voto Opcional")
    }else{
        println("Voto Obrigatório")
    }
}