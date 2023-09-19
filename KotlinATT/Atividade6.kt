// Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de
// consumo. Para cada consumidor, são digitados os seguintes dados:
//• Número do consumidor
//• Quantidade de kWh consumidos durante o mês
//• Tipo(código) do consumidor
//• Residencial, preço em reais por kWh = 0,3
//• Comercial, preço em reais por kWh = 0,5
//• Industrial, preço em reais por kWh = 0,7

//Os dados devem ser lidos até que seja encontrado um consumidor com número 0 (zero).
//Calcular e imprimir:

//• O custo total para cada consumidor
//• O total de consumo para os três tipos de consumidor
//• A média de consumo dos tipos 1 e 2

fun main() {
    var totalConsumoTipo1 = 0
    var totalConsumoTipo2 = 0
    var totalConsumoTipo3 = 0
    var totalCustoTipo1 = 0.0
    var totalCustoTipo2 = 0.0
    var totalCustoTipo3 = 0.0
    var totalConsumidores = 0

    while (true) {
        print("Digite o número do consumidor (ou 0 para sair): ")
        val numeroConsumidor = readLine()?.toIntOrNull()

        if (numeroConsumidor == 0) {
            break
        }

        print("Digite a quantidade de kWh consumidos: ")
        val consumo = readLine()?.toIntOrNull()

        print("Digite o tipo do consumidor (1 para Residencial, 2 para Comercial, 3 para Industrial): ")
        val tipoConsumidor = readLine()?.toIntOrNull()

        if (numeroConsumidor != null && consumo != null && tipoConsumidor != null) {
            var precoPorKWh = 0.0

            when (tipoConsumidor) {
                1 -> {
                    precoPorKWh = 0.3
                    totalConsumoTipo1 += consumo
                    totalCustoTipo1 += consumo * precoPorKWh
                }
                2 -> {
                    precoPorKWh = 0.5
                    totalConsumoTipo2 += consumo
                    totalCustoTipo2 += consumo * precoPorKWh
                }
                3 -> {
                    precoPorKWh = 0.7
                    totalConsumoTipo3 += consumo
                    totalCustoTipo3 += consumo * precoPorKWh
                }
            }

            totalConsumidores++
            val custoTotalConsumidor = consumo * precoPorKWh
            println("Custo total para o consumidor $numeroConsumidor: R$ $custoTotalConsumidor")
        } else {
            println("Entrada inválida. Por favor, digite valores numéricos.")
        }
    }

    val mediaConsumoTipo1e2 = (totalConsumoTipo1 + totalConsumoTipo2) / 2.0
    println("\nTotal de consumo para o Tipo 1: $totalConsumoTipo1 kWh")
    println("Total de consumo para o Tipo 2: $totalConsumoTipo2 kWh")
    println("Total de consumo para o Tipo 3: $totalConsumoTipo3 kWh")
    println("Média de consumo para os Tipos 1 e 2: $mediaConsumoTipo1e2 kWh")
    println("Total de consumidores: $totalConsumidores")
}