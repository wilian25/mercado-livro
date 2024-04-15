package fundamentos

fun main() {
    var nome = retornaNome()
    println(nome)
    dizOi("Wilian", 18)
    dizOi(retornaNome(), 18)
    dizOi(idade = 24, nome = "Gustavo")
    dizOi("Daniel")
}
// retornar valor
fun retornaNome(): String {
    return "Gustavo"
}
fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, parabens pelos seus ${idade} anos")
}