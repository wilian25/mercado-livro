package fundamentos

class MinhaClasse (
    var nome: String,
    var emdereco: String,
    var idade: Int
) {
    companion object {
        fun criarcomValoresPadrao(): MinhaClasse {
            return MinhaClasse("Gustavo", "Rua beltrao", 20)
        }

        fun criarAPartirDaSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.emdereco, segundaClasse.idade)
        }
    }
}
class SegundaClasse (
    var nome: String,
    var emdereco: String,
    var idade: Int
) {
    fun criarcomValoresPadrao(): SegundaClasse {
        return SegundaClasse("Gustavo", "Rua beltrao", 20)
    }
}
fun main() {
    var SegundaClasse = SegundaClasse("nome", "endereco", 10).criarcomValoresPadrao()

    var MinhaLoader = MinhaClasse.criarcomValoresPadrao()
}