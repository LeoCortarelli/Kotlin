// Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que possuírem
// valores negativos.
fun main() {
    var vetor = IntArray(20)

    vetor = intArrayOf(-10,20,30,40,-50,60,70,80,90,100,110,120,130,140,150,160,170,181,190,200)
    
    for(i in vetor.indices){
        if(vetor[i] < 0){
            vetor[i] = 0
        }
    }
    
    println("Vetor após atribuir 0 para elementos negativos:")
    vetor.forEach { print("$it ") }
    
}

// COM READLINE

fun main() {
    val vetor = IntArray(40)

    println("Digite os 40 valores do vetor:")
    for (i in vetor.indices) {
        print("Vetor[$i]: ")
        vetor[i] = readLine()?.toIntOrNull() ?: 0
    }

    for (i in vetor.indices) {
        if (vetor[i] < 0) {
            vetor[i] = 0
        }
    }

    println("Vetor após atribuir 0 para elementos negativos:")
    vetor.forEach { print("$it ") }
}
