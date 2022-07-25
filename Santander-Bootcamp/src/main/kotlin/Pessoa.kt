class Pessoa {
    var nome: String = "Davi"
    var cpf: String = "123.123.123.12"

    inner class Endereco{
        var rua: String = "Rua Teste"
    }
}

fun main(){
    val davi = Pessoa()
    println(davi.nome)
    println(davi.cpf)

    println(davi.Endereco().rua)
}