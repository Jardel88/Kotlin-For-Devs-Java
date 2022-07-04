package fundamentosbasicos

fun main(){

    //Inferencia de tipos, se for definido um valor, o compilador ja identifica seu tipo
    val myPhrase = "I'm a String"
    val MyPi = 3.14
    val myAnswer = 42

    //Se nao for definido um valor, deve-se definit seu tipo
    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 999777999777999L
    val myInt = 199

    //Precisam especificar seus tipos, o compilador entende como inteiro
    val myShort: Short = 12
    val myByte: Byte = 127

    //em Kotlin é necessário explicitar as conversoes de numeros
    val anInt: Int = 7
    val asLong: Long = anInt.toLong()
}