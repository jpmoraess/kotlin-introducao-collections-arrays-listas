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
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { i -> values[i].toBigDecimal() }
}