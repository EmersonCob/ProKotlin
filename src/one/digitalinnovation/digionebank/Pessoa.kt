package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "José"

    var cpf: String = "123.123.123-00"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"

}

fun main(){
    val jose = Pessoa()

    println(jose.pessoaInfo())
}