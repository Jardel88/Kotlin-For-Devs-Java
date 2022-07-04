package orientacaoobjetos

fun main(){
//Object type
    val location = object{
        var xCoordinate = 200
        var yCoordinate = 400
    }
    println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")

    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured = $temperature")
}
//Object declaration
object MySingleton{
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}