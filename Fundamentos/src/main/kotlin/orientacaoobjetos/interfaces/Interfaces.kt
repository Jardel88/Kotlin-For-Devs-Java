package orientacaoobjetos.interfaces

fun main(){

    //Quando o corpo do metodo for definido ele é herdado
    //Quando nao possuir corpo, o metodo tem que ser implementado por que assina o contrato

    val myCar = Car()
    myCar.start()
    println("My car's make = ${myCar.automakerName}")
}