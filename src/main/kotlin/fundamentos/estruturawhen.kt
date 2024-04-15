package fundamentos

fun main() {
//    val x = 25
//
//    when (x) {
//        5 , -5 -> println("x == 5")
//        8 -> println("x == 8")
//        9 -> println("x == 9")
//        10 -> {
//            println("x == 10")
//            println("x é uma dezena")
//        }
//        in 11..15 -> println("x esta entre 11 e 15")
//        !in 16..20 -> println("x nao esta no range de 16 a 20")
//        else -> println("Numero nao mapeado")
//    }
    //println(ComecaComOi("oi tudo bem?"))
    when {
        ComecaComOi(5) -> println("5")
        //ComecaComOi("oi tudo bem?") -> println("oi tudo bem")
        ComecaComOi("oi, estou bem!") -> println("oi, estou bem")
    }
}
fun ComecaComOi(x: Any): Boolean{
    return when (x) {
        //startsWith = Começa
        is String -> x.startsWith("oi")
        else -> false
    }
}