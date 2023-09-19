// Declare um vetor de 10 posições e o preencha com os 10 primeiros números ímpares e
// o escreva.
// Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa deverá
// fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado
// ou se não foi encontrado
fun main() {
    var vetor = IntArray(20)

    vetor = intArrayOf(10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200)
    
    print("Digite um valor para X: \n")
    val x = 100

    var encontrado = false
    var posicao = -1

    for (i in vetor.indices) {
        if (vetor[i] == x) {
            encontrado = true
            posicao = i
            break
        }
    }

    if (encontrado) {
        println("O valor $x foi encontrado na posição $posicao.")
    } else {
        println("O valor $x não foi encontrado no vetor.")
    }
}


// Com o READLINE
fun main() {
    // ... (código do preenchimento do vetor com ímpares)

    val vetor = IntArray(20)

    println("\nDigite os 20 valores do vetor:")
    for (i in vetor.indices) {
        print("Vetor[$i]: ")
        vetor[i] = readLine()?.toIntOrNull() ?: 0
    }

    print("Digite um valor para X: ")
    val x = readLine()?.toIntOrNull() ?: 0

    var encontrado = false
    var posicao = -1

    for (i in vetor.indices) {
        if (vetor[i] == x) {
            encontrado = true
            posicao = i
            break
        }
    }

    if (encontrado) {
        println("O valor $x foi encontrado na posição $posicao.")
    } else {
        println("O valor $x não foi encontrado no vetor.")
    }
}
