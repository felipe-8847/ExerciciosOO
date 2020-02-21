package exercicio04;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, int idade, String citNacimento, String cpf) {
        this.nome = nome;
        this.citNacimento = citNacimento;
        this.idade = idade;

    }
}