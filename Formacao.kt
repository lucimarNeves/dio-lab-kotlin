class Formacao(vararg  val conteudo : List<String>) : Item("") {

    override fun toString(): String {
        return nome + " " + conteudo.joinToString()
    }


   fun disciplina (  ){

        val disciplina = mutableListOf<String>()
        val duracao = 60
        val nivel = Nivel.BASICO


        println("Add Sintaxe básica : ${disciplina.add("Sintaxe básica")}")
        println("Diciplina adicionada: $disciplina")
        println("Carga horária adicionada: $duracao")
        println("Nível: $nivel")
       println()

    }

    fun disciplinaPOO (){

        val disciplinaPOO = mutableListOf<String>()
        val duracao = 180
        val nivel = Nivel.INTERMEDIARIO

        println("Add Conceitos POO : ${disciplinaPOO.add("Orientação Objetos")}")
        println("Diciplina adicionada: $disciplinaPOO")
        println("Carga horária adicionada: $duracao")
        println("Nível: $nivel")
        println()

    }

}