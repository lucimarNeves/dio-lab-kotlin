class Usuario ( var id : Int , vararg val tipo: List<String>) : Item(""){

    override fun toString(): String {
        return nome +  tipo.joinToString()
    }
}
