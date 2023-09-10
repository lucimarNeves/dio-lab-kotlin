## dio-lab-kotlin

# 

O Kotlin oferece funcionalidades para ajudar a gerenciar e manipular conjuntos de dados com mais facilidade usando a biblioteca padrão do Kotlin. Um  conjunto pode ser definido como uma série de objetos do mesmo tipo de dados. Existem vários tipos de conjuntos básicos no Kotlin: listas, conjuntos e mapas.

1. Uma lista é um conjunto ordenado de elementos de um tipo específico, como uma lista de Inteiros, Strings...
ex.

- val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6), 
- val colors = listOf("green", "orange", "blue")


2.  O índice é a posição inteira que reflete a posição do elemento (por exemplo, myList[2]).

3. Em uma lista, o primeiro elemento fica no índice 0 (por exemplo, myList[0]) e o último no myList.size-1 (por exemplo, myList[myList.size-1] ou myList.last()).
4. Há dois tipos de listas: List e MutableList..
ex.
- val entrees = mutableListOf<String>()
- val entrees = mutableListOf()
- val entrees: MutableList<String> = mutableListOf()
println("Entrees: $entrees")


4. Uma List é somente leitura e não pode ser modificada depois de inicializada. No entanto, você pode aplicar operações como sorted() e reversed(), que retornam uma nova lista sem mudar a original.
ex.

- val numbers = listOf("one", "two", "three", "four")
- println(numbers.reversed())

5.  Uma MutableList pode ser modificada após a criação, como ao adicionar, remover ou modificar elementos.
6.  É possível adicionar uma lista de itens a uma lista mutável usando addAll().
7. Use uma repetição while para executar um bloco de código até que a expressão seja avaliada como falsa e a repetição seja concluída.


