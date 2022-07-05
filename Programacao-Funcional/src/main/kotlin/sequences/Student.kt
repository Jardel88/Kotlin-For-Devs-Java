package sequences

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student>{
    return listOf(
    Student("Ada", 19),
    Student("Manuel", 23),
    Student("Maria", 20 ),
    Student("Joao", 39),
    Student("Jose", 16)
    )
}
