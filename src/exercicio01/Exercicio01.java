package exercicio01;

public class Exercicio01 extends Pessoa {

    public static void main(String[] args) {

        Pessoa felipe = new Pessoa();
        Pessoa heloisa = new Pessoa();
        Pessoa jubileu = new Pessoa();

        felipe.cor = "branco";
        felipe.idade = 25;
        felipe.nome = "felipe";

        heloisa.nome = "heloisa";
        heloisa.cor = "morena";
        heloisa.idade = 35;

        jubileu.nome = "jubileu";
        jubileu.cor = "azul";
        jubileu.idade = 99;

        System.out.println(felipe.nome);
        System.out.println("felipe é " + felipe.cor);
        System.out.println("tem " + felipe.idade + " anos");
        System.out.println("--------------------");

        System.out.println(heloisa.nome);
        System.out.println("heloisa é " + heloisa.cor);
        System.out.println("tem " + heloisa.idade + " anos");
        System.out.println("--------------------");

        System.out.println(jubileu.nome);
        System.out.println("jubileu é " + jubileu.cor);
        System.out.println("tem " + jubileu.idade + " anos");
        System.out.println("--------------------");

    }

}
