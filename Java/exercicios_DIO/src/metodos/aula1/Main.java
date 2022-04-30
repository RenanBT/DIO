package metodos.aula1;

public class Main {
    public static void main(String[] args) {

        //Exercicio Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.Soma(5, 6.7);
        Calculadora.Sub(10, 100);
        Calculadora.Div(9,3);
        Calculadora.Mult(11,11);

        //Exercicio Emprestimo

        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcularTaxas(1000, Emprestimo.parcelas12());
        Emprestimo.calcularTaxas(1000, Emprestimo.parcelas24());
        Emprestimo.calcularTaxas(1000, 36);
    }
}
