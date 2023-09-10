import org.junit.Test

import org.junit.Assert.*

class MatriculaTest {

    @Test
    fun getNumeroMatricula() {
        val numeroMatricula = 0;

        if ( numeroMatricula < 0){
            assertFalse("O número da maricula tem que ser maior que zero", false)
        }
    }


    @Test
    fun getUsuario() {
        val nome = "";

        if ( nome.isEmpty()){
            assertFalse("O nome precisa estar cadastrado", false)
        }
    }
}