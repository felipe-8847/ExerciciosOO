package exercicio03;

public class Execicio03 extends Livro {
    public static void main(String[] args) {
        Livro the100 = new Livro();


        the100.titulo = "terra";
        the100.autor = "felipe";
        the100.paginas = 2000;

        System.out.println(the100.titulo);
        System.out.println(the100.autor);
        System.out.println(the100.paginas);
    }

}
