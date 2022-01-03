package list

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956),
    Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A"),
    Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881),
    Livro("Iracema", "José de Alencar", 1865, "Editora B"),
    Livro("Senhora", "José de Alencar", 1875, "Editora B"),
    Livro("O Guarani", "José de Alencar", 1857, "Editora B"),
    Livro("Dom Casmurro", "Machado de Assis", 1899, "Editora A"),
    Livro("O Alienista", "Machado de Assis", 1882, "Editora A"),
    Livro("Papéis Avulsos", "Machado de Assis", 1882, "Editora B"),
)

val listaDeLivrosComNull: MutableList<Livro?> = mutableListOf(
    Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956),
    Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A"),
    Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881),
    null,
    Livro("Iracema", "José de Alencar", 1865, "Editora B"),
    null
)