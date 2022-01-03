package list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" } // valor default para editora quando a mesma for nula
        .forEach { (editora: String, livros: List<Livro>) ->
            println("Nome da editora: $editora || livros: ${livros.joinToString { it.titulo }}")
        }
}