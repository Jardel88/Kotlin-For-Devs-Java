package fundamentosbasicos



    fun main(){
        val myInt = 199
        val aInt: Int = 7

      //expressao ternaria em java
     //   int lowest = (myInt < aInt) ? myInt : aInt

        //mesma expressao em kotlin, quando if e usado como expressao, deve conter a clausula else
        val lowest = if (myInt < aInt) myInt else aInt

        val temp = 26
        val isAirConditionareOn = if (temp >= 27){
            println("It is warn")
            true
        } else{
            println("It is not so warn")
            false
        }
        println("Is the air conditioner on: $isAirConditionareOn")//Printando o valor de uma variavel em kotlin
    }
