package fundamentosbasicos

fun main(){

    //A expressao When no kotlin substitui a instrucao Swit case do java

    val pizzasOrdered = 9

    when (pizzasOrdered){
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("very hungry")
        else -> println("Are you sure?")
    }

    //Com combinacao de valores
    when (pizzasOrdered){
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3, 4 -> println("very hungry")
        else -> println("Are you sure?")
    }

    //Comparando o argumento usando o range
    when (pizzasOrdered){
        0 -> println("we need orders")
       in 1 .. 4 -> println("Got some orders")
       in 5 .. 9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    //Comparando o argumento com o resultado de uma expressao
    when (pizzasOrdered){
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    //When sem argumentos
    when{
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Impar")
        pizzasOrdered % 2 == 0 -> println("Par")
    }
}