package list

fun main() {
    val livro1 = Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956)
    val livro2 = Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A")
    val livro3 = Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881)
    val livro4 = Livro("Iracema", "José de Alencar", 1865, "Editora B")

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(Livro("Sagarana", "João Guimarães Rosa", 1946))

    livros.imprimeFormatado()

    livros.remove(livro1)

    livros.imprimeFormatado()
}

fun MutableList<Livro>.imprimeFormatado() {
    val formatado = this.joinToString(separator = "\n") {
        " => ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros ####")
    println(formatado)
}