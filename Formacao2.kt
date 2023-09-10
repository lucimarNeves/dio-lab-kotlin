class Formacao2(vararg  val conteudo : String) : Item("") {


    override fun toString(): String {
        if (conteudo.isEmpty()) {
            return "$nome Aguardando término sintaxe básica"
        } else {
            return nome + " " + conteudo.joinToString()
        }
    }


}