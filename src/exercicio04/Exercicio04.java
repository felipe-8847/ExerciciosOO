package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente mane = new Cliente();
        Funcionario tonto = new Funcionario();

        mane.nome = "mane";
        mane.cpf = "t12345t1234";
        mane.idade = 20;
        mane.citNacimento = "Sao paulo";

        tonto.nome = "tonto";
        tonto.idade = 50;
        tonto.citNacimento = "Rio de janeiro";
        tonto.numMatricula = 121212;

        mane.exibirDados();

        tonto.exibirDados();
    }

}
