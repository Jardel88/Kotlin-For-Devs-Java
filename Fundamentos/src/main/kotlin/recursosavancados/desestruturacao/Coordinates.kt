package recursosavancados.desestruturacao

/*
    * Desestruturacao e uma manerira de extrair apensa as variaveis desejaveis de um objeto complexo
    * as data class ja possuem mecanismos de Desestruturacao, durante a compilacao ele ja os inclui
    *
    * */
data class Coordinates(var x: Int, var y: Int){

    operator fun plus(other: Coordinates) : Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }
}
