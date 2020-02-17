/**
 * Exemplo de entrega dos programas pedidos no TP1
 *
 */

// // QUESTÃO 2 - TP1 
fun primeiroElemento(list: List<Int>){
    if(list[0] < list[list.lastIndex]){
        println("INFNET. Ja que o primeiro elemento da lista "+ "(" + list[0] + ")," +
                " eh MENOR que o ultimo "+ "(" + list[list.lastIndex] + ").")
    }
    if(list[0] > list[list.lastIndex]){
        println("TENFNI. Ja que o primeiro elemento da lista "+ "(" + list[0] + ")," +
                " eh MAIOR que o ultimo "+ "(" + list[list.lastIndex] + ").")
    }
    else {
        println("Esta lista possui primeiro elemento igual ao ultimo.")
    }

}

// // QUESTÃO 3 - TP1
fun maiorElemento(list:List<Int>){
    var controle = 0
    list.forEach{
        if(controle < it){
            controle = it
        }
    }
    println("O maior numero da lista: \n" + list +  ", eh " + controle +".")
}

// // QUESTÃO 4 - TP1
fun somaElemento(list:List<Int>){
    var pares = 0
    var impares = 0
    list.forEach {
        if(it % 2 == 0){
            pares += it
        }
        else {
            impares += it
        }
    }
    println("A soma de todos os numeros pares da lista: \n" + list +  ", eh " + pares +"."+
            "\nA soma de todos os numeros impares da lista: \n" + list +  ", eh " + impares +".")
}

// // QUESTÃO 5 - TP1
fun fatorialElemento(n: Int){
    var controle = 1
    var fatorial: Long = 1
    while (controle <= n) {
        fatorial *= controle
        controle += 1
    }
    println("O numero fatorial de $n eh $fatorial.")
}

// // QUESTÃO 6 - TP1
fun novaLista(list: List<Int>) {
    var new: MutableList<Int> = mutableListOf()
    list.forEach {
        var flag = false
        for (i in 2..it / 2) {
            if (it % i != 0) {
                flag = true
                break
            }
        }
        if (!flag)
            new.add(1)
        else
            new.add(0)
    }
    println(new)
}

// // QUESTÃO 7 - TP1     // PROBLEMA EM RETORNAR A SOMA DE TODOS OS NUMEROS
fun Q7(palavra: String){
    var resultado: Int = 0
    var letras = mapOf<String,Int>("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 5, "f" to 6, "g" to 7, "h" to 8, "i" to 9, "j" to 10,
        "k" to 11, "l" to 12, "m" to 13, "n" to 14, "o" to 15, "p" to 16, "q" to 17, "r" to 18, "s" to 19, "t" to 20,
        "u" to 21, "v" to 22, "w" to 23, "x" to 24, "y" to 25, "z" to 26)
    palavra.forEach {
        var letra = it
        var posi = palavra.indexOf(it)
        var asso = letras[it.toString()]
        var nonasso: Int = asso!!
        resultado = posi * nonasso
        //print (palavra.indexOf(it))
        //print (nonasso)
        print (resultado)

    }

}


val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
val vazio = listOf<Int>()
val lista = listOf(52,2,3,4,5,6,51)
val teste = listOf(1, 2, 3, 4, 5)
fun main() {

    //Questão 2
    //primeiroElemento(triangulo)
    //primeiroElemento(fibonacci)
    //primeiroElemento(lista)

    //Questão 3
    //maiorElemento(triangulo)
    //maiorElemento(fibonacci)
    //maiorElemento(vazio)
    //maiorElemento(lista)

    //Questão 4
    //somaElemento(triangulo)
    //somaElemento(fibonacci)
    //somaElemento(vazio)
    //somaElemento(lista)

    //Questão 5
    //fatorialElemento() //(Escolha um número inteiro)

    //Questão 6
    //novaLista(teste)
    //novaLista(fibonacci)
    //novaLista(vazio)
    //novaLista(lista)

    //Questão 7
    Q7("abc")
    //Q7("abacaxi")
    //Q7("pneumoultramicroscopicosilicovulcaniconiotico")

} 