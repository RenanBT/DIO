package introducao;

import java.io.IOException;
import java.util.Scanner;

public class DesafioIntermediarioDIO {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);


//declare suas variaveis corretamente
        int pares  = 0;
        int impares = 0;
        int positivos  = 0;
        int negativos = 0;


//continue a solução
        for (int i = 0; i<5; i++ ) {
            int scan = leitor.nextInt();

            if (scan %2 == 0){
                pares ++;
            }
            else{
                impares++;
            }

            if(scan >=0 ){
                positivos++;
            }
            else if ( scan <0){
                negativos++;
            }


        }



//insira suas variaveis corretamente
        System.out.println( pares +   " par(es)" );
        System.out.println( impares + " impar(es)");
        System.out.println( positivos + " positivo(s)");
        System.out.println( negativos + " negativo(s)");
    }
}




