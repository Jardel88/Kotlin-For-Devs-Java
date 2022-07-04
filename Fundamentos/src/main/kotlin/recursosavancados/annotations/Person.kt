package recursosavancados.annotations
//Anotacao de aviso que esta classe nao e mais indicada e mostrando por qual classe deve ser trocada
@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person internal constructor(firstName: String, lastName: String){

    init {
        println("Create a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
        this(firstName,lastName)
}