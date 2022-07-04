package recursosavancados.operatoroverloading

data class Coordinates(var x: Int, var y: Int){

    //Funcao para somar dois numeros
    operator fun plus(other: Coordinates) : Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }
}
