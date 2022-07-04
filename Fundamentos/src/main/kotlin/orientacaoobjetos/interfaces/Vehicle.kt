package orientacaoobjetos.interfaces

interface Vehicle {

    val automakerName: String

    fun start(){
        println("Ligando")
    }

    fun stop(){
        println("Desligando")
    }

    fun getKmPerLiter(): Int{
        return 17
    }

    fun getDoors(): Int

}