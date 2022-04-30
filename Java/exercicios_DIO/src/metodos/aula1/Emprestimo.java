package metodos.aula1;

public class Emprestimo {

    public static int parcelas12 (){
        return 12;
    }

    public static int parcelas24 (){
        return 24;
    }

    public static int parcelas36(){
        return 36;
    }

    public static double getTaxa12 (){
        return 0.3;
    }

    public static double getTaxa24(){
        return 0.4;
    }

    public static double getTaxa36(){
        return 0.5;
    }

    public static void calcularTaxas(double valor, int parcelas) {
        if (parcelas == 12) {
            double valorFinal = valor + (valor * getTaxa12());
            System.out.println("R$ " + valorFinal);

        } else if (parcelas == 24) {
            double valorFinal = valor + (valor * getTaxa24());
            System.out.println("R$ " + valorFinal);

        } else if (parcelas == 36) {
            double valorFinal = valor + (valor * getTaxa36());
            System.out.println("R$ " + valorFinal);

        }


    }

    }


