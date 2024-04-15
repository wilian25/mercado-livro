package fundamentos

fun main() {
     //println(parOuImpar(2))
    println(resultadoDaNota(3.0))
    println(resultadoDaNota(5.0))
    println(resultadoDaNota(8.0))
}
fun parOuImpar(numero: Int): String {
     return if (numero %2 == 0) {
         "Par"
     }else {
         "Impar"
     }
}
// Metodo para saber se um aluno passou ou não]
/*se a nota for > 6 -> Passou
* se a nota for > 4 e < 6 -> Recuperação
* se a nota for < 4 -> Reprovou*/
fun resultadoDaNota(nota: Double): String{
    return if (nota >= 6.0) {
        "Aprovado"
    }
    else if(nota > 4.0 && nota < 6.0) {
        "Recuperação"
    }else {
        "Reprovado"
    }
}
