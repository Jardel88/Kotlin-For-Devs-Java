package lambdas

fun main(){

    val students = getStudents()

    //Lambda setando nome e idade dentro de uma unica variavel
    val combos = students.map { a -> "${a.name} : ${a.age}" }
    println("Combos: $combos")

    //Se a lambda expression tiver apenas 1 parametro pode ser usado o it
    println("The oldest student is: ${students.maxByOrNull { it.age }}")

    //Lambiada para pegar o estudante com nome maior que 5
    println("The student with longest name is: ${students.filter { it.name.length > 5 }}")
}