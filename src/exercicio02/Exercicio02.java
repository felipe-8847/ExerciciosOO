package exercicio02;

public class Exercicio02 extends Triangulo {
    public static void main(String[] args) {
        Triangulo triangulo01 = new Triangulo();
        Triangulo triangulo02 = new Triangulo();
        Triangulo triangulo03 = new Triangulo();

        triangulo01.base = 10;
        triangulo01.altura = 20;

        triangulo02.base = 20;
        triangulo02.altura = 30;

        triangulo03.base = 30;
        triangulo03.altura = 40;

        System.out.println(triangulo01.area());
        System.out.println("====================");
        System.out.println(triangulo02.area());
        System.out.println("====================");
        System.out.println(triangulo03.area());
        System.out.println("====================");
    }
}
