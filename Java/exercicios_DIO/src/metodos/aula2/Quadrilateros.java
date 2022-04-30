package metodos.aula2;

public class Quadrilateros {

    public static void area (double lado){
        System.out.println("A area do quadrado = " + lado * lado);
    }

    public static void area (double lado1, double lado2){
        System.out.println("A area do retangulo = " + lado1 * lado2);
    }

    public static void area (double baseMenor, double baseMaior , double altura){
        System.out.println("A area do trapezio = " + ((baseMaior+baseMenor)*altura) / 2);
    }


}
