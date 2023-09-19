// A Companhia de Pulverização Faz Tudo Ltda utiliza aviões para pulverizar lavouras. Os
// custos de pulverização dependem do tipo de praga e da área contratada conforme o
// esquema:
// Tipo 1: pulverização contra ervas daninhas, R$ 5,00 por acre;
// Tipo 2: pulverização contra gafanhotos, R$ 10,00 por acre;
// Tipo 3: pulverização contra broca, R$ 15,00 por acre;
// Tipo 4: pulverização contra tudo acima, R$ 25,00 por acre.
// Se a área a ser pulverizada é maior que 300 acres, o fazendeiro recebe um desconto de
// 5%. Em adição, qualquer fazendeiro cujo custo total, sem desconto, ultrapasse R$
// 1.750,00 recebe um desconto de 10% sobre o valor que ultrapassar os R$ 1.750,00. Se
// ambos os descontos se aplicam, aquele relacionado a área é calculada em primeiro lugar.
fun main() {
    val tipoPraga = 4 // Exemplo: Pulverização contra tudo acima
    val area = 400 // Exemplo: 400 acres

    val custoPorAcre = when (tipoPraga) {
        1 -> 5.0
        2 -> 10.0
        3 -> 15.0
        4 -> 25.0
        else -> 0.0
    }

    var custoTotal = custoPorAcre * area

    if (area > 300) {
        val descontoArea = 0.05 * custoTotal
        custoTotal -= descontoArea
    }

    if (custoTotal > 1750) {
        val excesso = custoTotal - 1750
        val descontoValor = excesso * 0.1
        custoTotal -= descontoValor
    }

    println("O custo total de pulverização é R$ $custoTotal")
}