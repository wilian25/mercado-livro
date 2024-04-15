package fundamentos

fun main() {
    var mapNomesIdade = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    println(mapNomesIdade)
    mapNomesIdade["Bruno"] = 30 // adiciona o elemento bruno na lista
    println(mapNomesIdade)
    mapNomesIdade.remove("Bruno") /// remove o elemento bruno
    println(mapNomesIdade)
    //mapNomesIdade["Gustavo"] = 30 // atualiza a idade do gustavo
   // println(mapNomesIdade)
    mapNomesIdade.putIfAbsent("Bruno", 24) // sobscreve os dados do bruno
    println(mapNomesIdade)


//    var mapNomesIdade = mapOf("Gustavo" to 24, "Daniel" to 20)
//    println(mapNomesIdade)


//     var lista = mutableListOf(1, 2, 3, 4, 5, 6, 3, 20, 15)
//     var setNumeros = setOf(1, 2, 3, 2)
//    println(setNumeros)


//    var listaNomes = mutableListOf("Gustavo", "Daniel")
//    println(listaNomes)
//    listaNomes.sort()// neste caso ordena por ordem alfabetica
//    println(listaNomes)


//    var lista = mutableListOf(1, 2, 4, 5, 6, 3, 20, 15)
//    println(lista)
//    lista.sort()// sort -> ordena a lista
//    println(lista)
//    lista.shuffle() // shuffle -> embaralha a lista
//    println(lista)


//    var lista = mutableListOf(1, 2, 3, 4, 5, 6)
//    println(lista)
//    lista.add(8)
//    println(lista)
//    lista.removeAt(0) //remove o elemento na posicao 0
//    lista.remove(3) //remove o elemento 3 da lista
//    lista[0] = 20
//    println(lista)


//    var lista = listOf(1, 2, 3, 4, 5, 6)
//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(6))// para saber a posicao do elemento 6


//      var lista = listOf(1, 2, 3, 4, 5, 6)
//      for (Numero in lista) {
//          println(Numero)
//      }


//    var lista = listOf(1, 2, 3 ,4, 5, 6)
//    lista.forEach {
//        println(it)
       //it acesa o elemento da vez
//    }


    //Pega o primeiro valor par da lista
//    var lista = listOf(1, 2, 3, 4, 5, 6)
//    val pares = lista.filter { it % 2 == 0 }.first()
//    println(pares)


    //Pega todos os valores pares da minha lista
//    var lista = listOf(1, 2, 3, 4, 5, 6)
//    val pares = lista.filter { it % 2 == 0 }
//    println(pares)
}