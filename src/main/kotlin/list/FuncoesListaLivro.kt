package list

fun List<Livro?>.imprimeFormatado() {
    val formatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " => ${it.titulo} de ${it.autor}"
        }
    println(" #### Lista de Livros ####")
    println(formatado)
}