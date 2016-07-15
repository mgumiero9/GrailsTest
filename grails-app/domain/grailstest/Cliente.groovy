package grailstest

class Cliente {

    String nome
    String cpf
    Date dataNascimento
    String classeSocial

    static constraints = {
        classeSocial inList: ["BAIXA", "MÉDIA", "ALTA"]
    }
}
