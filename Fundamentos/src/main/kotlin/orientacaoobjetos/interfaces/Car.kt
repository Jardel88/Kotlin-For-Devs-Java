package orientacaoobjetos.interfaces

import orientacaoobjetos.interfaces.Vehicle

class Car : Vehicle {
    override val automakerName = "Honda"

    //    override fun getDoors(): Int {
//        return 5
//    }

    //Com inferencia
    override fun getDoors() = 5
}