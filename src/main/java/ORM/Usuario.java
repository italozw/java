package ORM;

public class Usuario {
    private Nome nome;
    private Cpf cpf;
    private Email email;
    private Telefone telefone;
    private Nascimento dataNascimento;
    private Endereco endereco;

    public Usuario(Nome nome, Cpf cpf, Email email, Telefone telefone, Nascimento dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
