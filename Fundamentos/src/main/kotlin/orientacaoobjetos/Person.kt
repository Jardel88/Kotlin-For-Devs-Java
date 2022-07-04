package orientacaoobjetos

//class Person constructor(firstName: String, lastName: String)
//class Person (firstName: String, lastName: String)
class Person internal constructor(firstName: String, lastName: String){

    //O metodo init inicia alguma acao sempre que a classe é iniciada
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
        this(firstName,lastName)
}