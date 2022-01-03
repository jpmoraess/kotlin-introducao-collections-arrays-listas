package list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    val editora: String? = null,
)