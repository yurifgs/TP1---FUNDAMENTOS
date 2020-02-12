/**
 * Exemplo de entrega dos programas pedidos no TP1
 *
 */


val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
val vazio = listOf<Int>()
val lista = listOf(50,2,3,4,5,6,51)

// // QUESTÃO 2 - TP1 
fun primeiroElemento(lista: List<Int>){
    if(lista[0] < lista[lista.lastIndex]){
        println("Infnet")
    }
    else {
        println("Tenfni")
    }
}

// // QUESTÃO 3 - TP1
fun maiorElemento(list:List<Int>): Int{
    var controle = 0
    lista.forEach{
        if(controle < it){
            controle = it
        }
    }
    return (controle)
}

fun main() {

    //Questão 2
    primeiroElemento(lista)

    //Questão 3
    maiorElemento(lista)
    //maiorElemento(fibonacci)
    //maiorElemento(vazio)
}