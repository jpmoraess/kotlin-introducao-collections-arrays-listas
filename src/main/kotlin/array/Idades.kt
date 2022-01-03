fun main() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.maxOrNull()
    println("maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("menor idade: $menorIdade")

    val mediaIdade = idades.average()
    println("média idades: $mediaIdade")

    val todosSaoMaiores = idades.all { it >= 18 }
    println("Todos são maiores de idade ? $todosSaoMaiores")

    val peloMenosUmMaior = idades.any { it >= 18 }
    println("Pelo menos um é maior de idade ? $peloMenosUmMaior")

    val maioresDeIdade = idades.filter { it >= 18 }
    println("maiores de idade: $maioresDeIdade")

    val busca = idades.find { it > 18 }
    println("busca maior: $busca")
}