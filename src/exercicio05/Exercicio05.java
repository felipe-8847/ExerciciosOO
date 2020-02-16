package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        Caneta bic = new Caneta();
        Lapis castel = new Lapis();
        Pena_mosquito antigo = new Pena_mosquito();

        bic.ehfeitoDe = "metal";
        bic.escreCom = "tinta";

        castel.ehfeitoDe = "madeira";
        castel.escreCom = "grafite";

        antigo.ehfeitoDe = "metal";
        antigo.escreCom = "nanquim";

        System.out.println(bic.escreCom);
        System.out.println(castel.escreCom);
        System.out.println(antigo.escreCom);

    }
}
