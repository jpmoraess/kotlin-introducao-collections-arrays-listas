fun main() {
    val idades = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("maior idade: $maiorIdade")

    println("Utilizando forEach")

    var menorIdade = Int.MAX_VALUE

    idades.forEach { idade ->
        if (idade < menorIdade) menorIdade = idade
    }

    println("Menor Idade: $menorIdade")
}