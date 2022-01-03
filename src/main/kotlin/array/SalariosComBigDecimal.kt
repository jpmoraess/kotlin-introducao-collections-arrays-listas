import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.88", "1900.55", "2303.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    /**
     * Aumento de 10% para cada funcionário...
     * Aumento mínimo deve ser de R$ 500.00 para cada funcionário..
     */
    val aumento = "1.1".toBigDecimal()

    val salariosComAumento = salarios.map { salario ->
        if (salario < "5000.00".toBigDecimal())
            salario + "500".toBigDecimal()
        else
            (salario * aumento).setScale(2, RoundingMode.UP)
    }.toTypedArray()

    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    /**
     * Calcular a somatória dos salários
     * Calcular a somatória dos salários por 6 meses para saber os gastos...
     */

    val totalSalarios = salariosComAumento.somatoria()
    println("Valor total dos salários com aumento: $totalSalarios")

    val totalSalariosProximos6Meses = salariosComAumento.somatoria() * BigDecimal(6)
    println("Valor total dos salários com aumento em 6 meses: $totalSalariosProximos6Meses")

    val salarioInicialMais6Meses = salariosComAumento.fold(totalSalarios) { acc, valor ->
        acc + (valor * BigDecimal(6)).setScale(2,
            RoundingMode.UP)
    }
    println("Valor total salários mês inicial + 6 meses: $salarioInicialMais6Meses")


    /**
     * Média dos 3 maiores salários...
     */

    //val salariosComAumentoOrdenados = salariosComAumento.sorted() // sorted - ordena do menor para o maior
    //val tresUltimosSalarios = salariosComAumentoOrdenados.takeLast(3).toTypedArray() // pega os 3 últimos salários ...
    //val mediaTresUltimosSalarios = tresUltimosSalarios.media()
    //println("Média dos 3 últimos salários: $mediaTresUltimosSalarios")

    val mediaTresUltimosSalarios = salariosComAumento
        .sorted() // sorted- ordena do menor salário para o maior salário
        .takeLast(3) // takeLast - pega as últimas n posições
        .toTypedArray() // transforma para Array
        .media() // extension function responsável por calcular a média.
    println("Média dos 3 últimos salários: $mediaTresUltimosSalarios")

    val mediaTresMenoresSalarios = salariosComAumento
        .sorted()
        .take(3) // take - pega as primeiras n posições
        .toTypedArray()
        .media()
    println("Média dos 3 menores salários: $mediaTresMenoresSalarios")
}