package sequences
/*
Sequencies sao a mesma coisa que as streams do Java 8, a diferenca e que sequences nao podem rodar em varias cpu,
sequencies nao sao colecoes, uma sequencie nao e gerada ate que uma operacao seja finalizada
*/
fun main(){

    var students = getStudents()

    //Uma das melhores maneriras de criar uma sequence e convertendo uma collection
    val sqStudents = students.drop(1).take(3).toList()//apaga o primeiro pega os outros 3 e lista
    println("Sequenced students: $sqStudents")

    //Uma sequence tambem pode ser gerada em tempo real
    val numbers = generateSequence(100) { it + 1 }
    println("Numbers: ${numbers.drop(5).take(20).toList()}")

    //Gerando sequence com raiz quadrada, pegando numeros pares e listando a partir de 5
    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }
    println("Even Squares: ${evenSquares.take(5).toList()}")

    //Gerando sequence com fibonacci
    val fibonacci = generateSequence(1 to 1)
        { it.second to it.first + it.second }.map { it.first }
    println("Fibonacci: ${ fibonacci.take(15).toList() }")
}