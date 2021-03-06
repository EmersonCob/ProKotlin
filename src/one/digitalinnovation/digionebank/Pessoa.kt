package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "José"

    var cpf: String = "123.123.123-00"
    private set
}

fun main(){
    val jose = Pessoa()

    println(jose)
    println(jose.name)
    println(jose.cpf)
}