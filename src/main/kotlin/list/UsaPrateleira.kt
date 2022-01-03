package list

fun main() {
    val prateleira = Prateleira("Literatura", listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeFormatado()
    porAnoPublicacao.imprimeFormatado()
}