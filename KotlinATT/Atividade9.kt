// Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.

fun main() {
    var vetor = IntArray(20)

    vetor = intArrayOf(10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,181,190,200)
    
   var contPares = 0
    
    for(i in vetor.indices){
        if(vetor[i] % 2 == 0){
            contPares++
        }
    }
    
    if(contPares != 0){
        println("O vetor possui $contPares valores pares.")
    }else{
        println("O vetor não possui numeros pares")
    }
}

// COM READLINE
fun main() {
    val vetor = IntArray(40)

    println("Digite os 40 valores do vetor:")
    for (i in vetor.indices) {
        print("Vetor[$i]: ")
        vetor[i] = readLine()?.toIntOrNull() ?: 0
    }

    var contadorPares = 0

    for (valor in vetor) {
        if (valor % 2 == 0) {
            contadorPares++
        }
    }

    println("O vetor possui $contadorPares valores pares.")
}
