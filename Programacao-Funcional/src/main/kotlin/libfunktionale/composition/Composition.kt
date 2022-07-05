package libfunktionale.composition

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

fun main(){

    /*
    * Composicao e uma tecnica de programacao funcional, ela cria uma nova funcao combinando
    *  o resultado de 2 outras funcoes
    * */

    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i: Int -> i * 2}

    //Compose usa o resultado da segunda como parametro para a primeira
    val multiplyBy2andAdd5 = add5 compose multiplyBy2

    val composeResult = multiplyBy2andAdd5(10)
    println("multiplyBy2andAdd5(10) = $composeResult")

    //ForwardCompose faz o inverso usa o resultado da primeira como parametro para a segunda
    val add5AndMultiplyBy2 = add5 forwardCompose multiplyBy2

    val forwardComposeResult = add5AndMultiplyBy2(10)
    println("multiplyBy2andAdd5(10) = $forwardComposeResult")

}