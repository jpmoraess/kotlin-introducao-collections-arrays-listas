fun main() {
    val serie: IntRange = 1.rangeTo(10)

    for (s in serie) {
        print("$s ")
    }

    println()

    val numerosPares = 2..100 step 2

    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    val numerosParesReverso = 100 downTo 2 step 2
    numerosParesReverso.forEach { print("$it ") }

    println()

    val intervaloSalario = 1500.0..5000.0

    val salario = 7000.0

    if (salario in intervaloSalario) println("Salário está dentro do intervalo") else println("Salário não está dentro do intervalo")

    println()

    val alfabeto = 'a'..'z'

    val letra = 'K'

    println(letra in alfabeto)
}