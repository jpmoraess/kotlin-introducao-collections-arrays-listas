package list

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>,
) {
    fun organizarPorAutor(): MutableList<Livro> {
        return livros.sortedBy { it.autor }.toMutableList()
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro> {
        return livros.sortedBy { it.anoPublicacao }.toMutableList()
    }
}