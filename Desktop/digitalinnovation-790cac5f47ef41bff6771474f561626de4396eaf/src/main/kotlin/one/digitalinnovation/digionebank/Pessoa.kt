package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Christian"
    var cpf : String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
    }

fun main(){
    val christian = Pessoa()
    println(christian.pessoaInfo())
    }