package one.digitalinnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
    ){
    fun bancoInfo() = "$nome e $numero"
}
