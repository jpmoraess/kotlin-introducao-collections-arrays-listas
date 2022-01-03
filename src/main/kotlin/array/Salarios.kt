fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8300.00, 10000.00)

    val aumento = 1.1

    /**
     * Iteração Manual
     */

//    var indice = 0
//    for (salario in salarios) {
//        salarios[indice] = salario * aumento
//        indice++
//    }
//
//    println(salarios.contentToString())

    /**
     * Iteração com indice
     */

//    for (indice in salarios.indices) {
//        salarios[indice] = salarios[indice] * aumento
//    }
//
//    println(salarios.contentToString())
//
//

    /**
     * Iteração com forEach indexado (forEachIndexed)
     */

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }

    println(salarios.contentToString())
}