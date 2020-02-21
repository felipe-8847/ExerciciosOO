package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente mane = new Cliente("mane",20," Sao Paulo","94949494949");
        Funcionario tonto = new Funcionario("tonto",50," Rio De Janeiro",121212);

        mane.exibirDados();
        System.out.println("=======================");
        tonto.exibirDados();
        // No exercicio não pede pera usar o construtor
        // porem para resolver o execicio 04 eu tive que usar o contrutor.

    }

}
