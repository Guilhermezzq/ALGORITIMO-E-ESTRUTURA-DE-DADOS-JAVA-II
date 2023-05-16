
import java.util.Scanner;

public class c08ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0, impar = 0, somaDivisivel4 = 0, quantidadeDivisivel3 = 0;

        for (int way = 1; way <= 10; way++) {
            System.out.print("Digite o " + way + "º número inteiro: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " é par.");
                par++;
            } else {
                System.out.println(num + " é ímpar.");
                impar++;
            }

            if (num % 4 == 0) {
                somaDivisivel4 += num;
            }

            if (num % 3 == 0) {
                quantidadeDivisivel3++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
        System.out.println("Soma dos números divisíveis por 4: " + somaDivisivel4);
        System.out.println("Quantidade de números divisíveis por 3: " + quantidadeDivisivel3);
    }
}