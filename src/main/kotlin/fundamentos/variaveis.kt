package fundamentos

fun main() {
    // Mutavel,  pode ser reatribuida
    var nome = "Gustavo"
    // VAL = Não Mutavel, não pode ser modificada pois ja foi definido um valor a ela
    val nomeVal = "Gustavo"
    // Exemplos
    nome = "Daniel"
    //nomeVal = "Daniel" = ERRO

    val idade = 24
    println(idade)

    val teste: String
    teste = "teste.Teste"

    var texto = "Texto"
    texto = "123"

}
class variaveis {
    lateinit var teste: String

    fun iniciavariaveis() {
        teste = "teste"
    }
}