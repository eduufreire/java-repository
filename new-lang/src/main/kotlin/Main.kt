fun main(args: Array<String>) {
    println("Hello World!")
    
    // variaveis
    var numero: Int
    var numeroReal: Double
    var bool: Boolean
    var text: String
    
    
    numero = 1
    //ifs
    if(numero > 5){
        println("Oi")
    }else{
        println("oi")
    }
    
    // laços
    for (i in (0..10)){
        println(i)
    }
    
    // lista
    val lista = mutableListOf("a", "b", "c")
    lista.add("d")
    lista.add("e")
    
    for (item in lista.indices){
        println(lista[item])
    }
    
    // switch case
    when(text){
        "abc"->println("abc")
        "cde"->println("aaaaa")
    }

    //funcoes
    fun soma(a: Int, b: Int): Int {
        return a + b
    }

    //classe
    var pessoa = Pessoa("Edu", 18, false, 1.77)

    println("Nome: ${pessoa.nome}")
    println("Idade: ${pessoa.idade}")


}

