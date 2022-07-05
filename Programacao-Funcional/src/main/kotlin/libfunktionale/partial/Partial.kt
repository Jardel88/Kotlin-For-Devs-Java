package libfunktionale.partial

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {
    /*
    * Uma Partial application usa uma funcao que aceita alguns argumentos vinculando a um ou mais desses argumentos
    * e retornando uma nova funcao que aceita apenas argumentos nao vinculados restantes.
    * Partial e Currying da a capacidade de criar funcoes especializadas a partir de funcoes gerais,
    * sem introduzir duplicacoes de codigo
    * */

    //  prefix  _X_ postfix
    val prefixAndPostFix: (String, String, String) -> String =
        {prefix: String, x: String, postfix: String
            -> "${prefix}${x}${postfix}"}

    val prefixAndAlert: (String, String) -> String =
        prefixAndPostFix.partially3("!")

    val hello: (String) -> String = prefixAndAlert.partially1("Hello, ")

    println(hello("FunKTionale"))

}