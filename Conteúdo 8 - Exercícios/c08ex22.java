/*
import java.util.Scanner;

public class c08ex22 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite numeros primos: ");
        int numero = away.nextInt();

        for (int way = 1; way <= 45; way++) {


            if (numero % way == 0) {
                soma = numero / way ;


                System.out.println(numero + " sao primos.");
            } else {
                System.out.println(numero + " nao sao primos.");
            }
        }
    }
}
*/

import java.util.Scanner;

public class c08ex22 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite um número primo: ");
        int numero = away.nextInt();

        for (int way = 2; way <= numero; way++) {
            if (numero % way == 0 && numero != way) {
                System.out.println("O número não é primo.");
                return;
            }
        }

        System.out.println("O número é primo.");

        away.close();
    }
}
