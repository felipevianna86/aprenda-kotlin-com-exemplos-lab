enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Pessoa(val nome: String, val idade: Int)

data class Usuario(val usuario: String, val pessoa: Pessoa){


    fun cadastrarUsuario(): Usuario {
        val usuarioNovo = Usuario(usuario, pessoa)
        println("Usuario ${usuarioNovo.pessoa.nome} cadastrado!")
        return usuarioNovo
    }
}

data class Matricula(val usuario: Usuario)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        val matricula = Matricula(usuario)
        print("Usuario ${matricula.usuario.pessoa.nome} matriculado!")
    }
}

fun main() {
    val pessoa = Pessoa("Felipe", 37)
    val usuario = Usuario("felipevianna86", pessoa)
    usuario.cadastrarUsuario()
    //val formacao = Formacao()
    //formacao.matricular(usuario)
}