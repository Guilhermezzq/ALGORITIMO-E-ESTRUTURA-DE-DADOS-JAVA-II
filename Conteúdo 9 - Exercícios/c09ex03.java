import java.util.Scanner;

public class c09ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double resultado = 0;

        System.out.print("Digite a quantidade de termos da série: ");
        n = input.nextInt();

        for (int way = 1; way <= n; way++) {
            resultado += (1 + Math.sqrt(4 * way)) / (3 * way);
        }

        System.out.println("Resultado da série: " + resultado);
    }
}
