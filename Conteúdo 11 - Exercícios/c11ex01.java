import java.util.Scanner;

public class c11ex01 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double fx , media , soma = 0;
        int cont = 0 , x = 1 , numero ;

        System.out.println("Digite um número inteiro ímpar: ");
        numero = away.nextInt();

        while ( x <= numero) {
            fx = Math.pow(x,2) + (4 * x -2) / 5.0;

            if (x % 2 !=0) {
                System.out.printf("x=%d f(x)=%.1f\n", x, fx);
                soma += fx;
                cont++;
            }
            x++;

        }

        media = soma / cont ;
        System.out.printf("\nMédia de f(x) = %.1f\n", media);
    }
}
