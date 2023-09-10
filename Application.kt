class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        //**** USUÁRIOS *****
         val usuario1 = Usuario(1, listOf("José Ricardo", "tipo - aluno"))
         val usuario2 = Usuario(2, listOf("Marilinda Ferreira", "tipo - aluno"))
         val usuario3 = Usuario(3, listOf("Marilia de Dirceu", "tipo - aluno"))
         val usuario4 = Usuario(4, listOf("Ana Maria", "tipo - aluno"))
         val usuario5 = Usuario(5, listOf("Humberto de Campos", "tipo - aluno"))

         //**** Nível *****
         val option = Nivel.BASICO
         val option2 = Nivel.INTERMEDIARIO
         val option3 = Nivel.DIFICIL

         //**** FORMAÇÃO *****
         val formacao1 = Formacao(listOf("Funcões ", "Variaveis", "Classes", "Condicionais"))
         formacao1.disciplina()


         val  formacao2 = Formacao2()

         val formacao3 = Formacao(listOf("Classes ", "Herança", "Propriedades", "Interfaces"))
         formacao3.disciplinaPOO()



        //**** MATRICULAS *****
            val  matriculaList = mutableListOf<Matricula>()

             val matricula1 = Matricula(1010, nivel = Nivel.BASICO, usuario1.id)
                 .addItem(usuario1)
                 .addItem(formacao2)
                 matriculaList.add(matricula1)

            val matricula2 = Matricula(1011, nivel = Nivel.BASICO, usuario2.id)
                .addItem(usuario2)
                .addItem(formacao1)
                matriculaList.add(matricula2)


            val matricula3 = Matricula(1012, nivel = Nivel.BASICO, usuario3.id)
                .addItem(usuario3)
                .addItem(formacao1)
                 matriculaList.add(matricula3)


            val matricula4 = Matricula(1013, nivel = Nivel.INTERMEDIARIO, usuario4.id)
                .addItem(usuario4)
                .addItem(formacao3)
                matriculaList.add(matricula4)

            val matricula5 = Matricula(1014, nivel = Nivel.INTERMEDIARIO, usuario5.id)
                .addItem(usuario5)
                .addItem(formacao3)
            matriculaList.add(matricula5)


            for(matriculas in matriculaList){
                matriculas.print()
                println()
            }
        }
    }
}