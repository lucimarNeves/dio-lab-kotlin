open class ConteudoEducacional(vararg val duracao : Int) : Item("ConteudoEducacional"){

    override fun toString(): String {
        return nome + " " + duracao.joinToString()
    }
}

