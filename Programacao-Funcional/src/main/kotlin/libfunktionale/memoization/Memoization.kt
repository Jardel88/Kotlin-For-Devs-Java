package libfunktionale.memoization

import org.funktionale.memoization.memoize

fun main(){
    /*
    * Memoization e uma maneira de melhorar o desempenho do codigo, fazendo cache de operacoes demoradas
    * com base nas suas entradas de parametros
    * */

    var fibonacci: (Long) -> Long = {it}

    //Fibonacci de forma recursiva
    fibonacci = {n: Long ->
        if (n < 2) n else fibonacci(n - 1) + fibonacci(n - 2)
    }

    var m: (Long) -> Long = {it}

    m = {n: Long ->
        if (n < 2) n else m(n - 1) + m(n - 2)
    }.memoize()

    println("Calling fibonacci: ${timeElapsed {fibonacci(40)}} ms")
    println("Calling memoized fibonacci: ${timeElapsed {m(40)}} ms")
}

fun timeElapsed(body: () -> Unit): Long {

    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end - start
}
