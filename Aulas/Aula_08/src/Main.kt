import java.util.*
/*
fun main() {

    var shoppingList = arrayOf("Pão", "Café", "Leite", "Açúcar", "Manteiga")

    //Buscando a lista inteira
    //println(Arrays.toString(shoppingList))

    //Calculando o tamanho da lista

    println(shoppingList.size)
}*/

fun main(){
    val schoolCard = doubleArrayOf(8.5, 7.0, 9.5, 6.0)
    val schoolAverage = schoolCard.average()

    println("Notas: ${schoolCard.joinToString(", ")}")
    println("Média: $schoolAverage")

}