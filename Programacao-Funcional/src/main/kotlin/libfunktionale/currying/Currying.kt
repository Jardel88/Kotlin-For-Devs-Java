package libfunktionale.currying

import org.funktionale.currying.curried

fun main(){
    /*
    * Currying faz o encadeamento de funcoes, ele pega uma funcao que tem varios argumentos
    * e transforma em uma cadeia de funcoes, cada uma delas com um argumento
    * */

    val sum3Ints = {x: Int, y: Int, z: Int -> x + y + z}

    val curried: (Int) -> (Int) -> (Int) -> Int = sum3Ints.curried()
    val curriedResult = curried(2)(4)(6)

    println("curried(2)(4)(6) = $curriedResult")
}