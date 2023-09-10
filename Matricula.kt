class Matricula(
    val numeroMatricula: Int,
    val nivel: Nivel,
    val usuario: Int
) {
    private  val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item) : Matricula{
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item> ) : Matricula{

        itemList.addAll(newItems)
        return this
    }

    fun print(){

        println("Matricula #${numeroMatricula}")
        println("Nível ${nivel}}")
        var inscritos = usuario

        for (item in itemList) {
            println("${item}: ${item.nome}")
            inscritos= usuario + 1
        }
        println("Total de inscritos: ${inscritos - 1}")
    }
}