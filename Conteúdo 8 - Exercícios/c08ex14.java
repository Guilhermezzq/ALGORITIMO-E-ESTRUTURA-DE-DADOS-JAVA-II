import java.util.Scanner;

public class c08ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número (entre 1 e 20): ");
        int n = input.nextInt();
        input.nextLine();

        System.out.print("Digite um símbolo: ");
        String simbolo = input.nextLine();

        if (n < 1 || n > 20) {
            System.out.println("Número inválido. Digite um número entre 1 e 20.");
        } else {
            for (int way = 0; way < n; way++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(simbolo + " ");
                }
                System.out.println();
            }
        }

        input.close();
    }
}
   // Reescreve 2 vezes utilizando formas diferentes