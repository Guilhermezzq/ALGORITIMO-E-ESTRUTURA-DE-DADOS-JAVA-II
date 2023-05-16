import java.util.Scanner;

public class c08ex30 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = away.nextDouble();

        System.out.print("Digite o valor de n: ");
        int n = away.nextInt();

        away.close();

        double soma = 0.0;


        for (int way = 3; way <= n; way++) {
            double termo = Math.pow(x, way) /way;
            soma += termo;
        }


        double primeiroTermo = Math.log(x + x + Math.pow(x,2/ 2));
        soma += primeiroTermo;


        System.out.println("S = " + soma);
        away.close();
    }
}
