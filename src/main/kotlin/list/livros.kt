package list

val listaDeLivrosComNull: MutableList<Livro?> = mutableListOf(
    Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956),
    Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A"),
    Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881),
    null,
    Livro("Iracema", "José de Alencar", 1865, "Editora B"),
    null
)