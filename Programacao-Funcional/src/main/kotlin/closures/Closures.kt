package closures
//Closures e quando as variaveis locais de uma funcao sao mantidas vivas apos o termino da execucao da funcao
//Unit e equivalente a um metodo void no java
fun closureMaker(): () -> Unit{

    var num = 0;
    return { println(num++) }

}
fun main(){

    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()
}