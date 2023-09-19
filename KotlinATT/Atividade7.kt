// Leia um vetor de 12 posições e em seguida ler dois valores X e Y quaisquer
// correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma
// dos valores encontrados nas respectivas posições X e Y.

fun main() {
    var vetor = IntArray(12)

    vetor = intArrayOf(10,20,30,40,50,60,70,80,90,10,11,12)
    
    // Funcao para Ler os valores para o vetor
    // println("Digite os 12 valores do vetor:")
    // for (i in vetor.indices) {
    //     print("Vetor[$i]: ")
    //     vetor[i] = readLine()?.toIntOrNull() ?: 0
    // }

    //print("Digite o valor de X: ")
    val x = 20

    //print("Digite o valor de Y: ")
    val y = 11

    var acheiX = 0
    var acheiY = 0
    
    for(i in vetor.indices){
        if(x == vetor[i]){
            acheiX = vetor[i]
        }
        
        if(y == vetor[i]){
            acheiY = vetor[i]
        }
    }
    
    
    val soma = acheiX + acheiY
    
    println("A soma e $soma")
}

// COM READLINE
fun main() {
    val vetor = IntArray(12)

    // Lendo os valores para o vetor
    println("Digite os 12 valores do vetor:")
    for (i in vetor.indices) {
        print("Vetor[$i]: ")
        vetor[i] = readLine()?.toIntOrNull() ?: 0
    }

    print("Digite o valor de X: ")
    val x = readLine()?.toIntOrNull() ?: 0

    print("Digite o valor de Y: ")
    val y = readLine()?.toIntOrNull() ?: 0

    // Verificando se as posições X e Y são válidas
    if (x in 0 until 12 && y in 0 until 12) {
        val soma = vetor[x] + vetor[y]
        println("A soma dos valores nas posições $x e $y é: $soma")
    } else {
        println("As posições inseridas não são válidas.")
    }
}