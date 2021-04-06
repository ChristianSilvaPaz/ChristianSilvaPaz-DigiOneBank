package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digOneBank = Banco(nome = "Santander", numero = 1234)

    println(digOneBank.bancoInfo())

    val testeBanco = digOneBank.copy(nome = "teste", numero = 4321)
    println(testeBanco.bancoInfo())
}