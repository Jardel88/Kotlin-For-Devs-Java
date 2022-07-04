package recursosavancados.reflections


fun main(){

    val person = Person("Teste", "Teste")

    val kClass = person::class

    //println("Simple name = $kClass")
    println("Simple name = ${kClass.simpleName}")

    //for (fields in kClass.members){
    for (fields in kClass.java.declaredFields){
        //println("Property name = $fields")
        println("Property name = ${fields.name}")
    }

    for (constructor in kClass.constructors){
        println("Constructor = $constructor")
        println("Constructor Return = ${constructor.returnType}")
        println("Constructor Parameters = ${constructor.parameters}")
    }
}