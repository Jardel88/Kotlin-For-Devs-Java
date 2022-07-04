package recursosavancados.desestruturacao

import recursosavancados.operatoroverloading.Coordinates

fun main(){

    showComponents()


    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)

    //Cria 2 variaveis e extrai os valores de c3
    val (xCoordinates, yCoordinates) = c3
    //O kotlin obtem os valores com base na ordem que as propriedades foram criadas em seu construtor
    println("xCoordinate = $xCoordinates, yCoordinate = $yCoordinates")

    //Por baixo dos panos o Kotlin cria alguns operadores, neste exemplo, component1 e component2
    println("xCoordinate = ${c3.component1()}")

}

//Desestruturacao em classes comuns
fun showComponents(){
    val myPoint = Point(5000, 500, 50)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}