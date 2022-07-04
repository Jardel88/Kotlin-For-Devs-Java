package recursosavancados.operatoroverloading

fun main(){

    //Soma a posicao de x c1 + x c2 e a posicao de y c1 + y c2
    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)

}