import java.util.Scanner;

public class c11ex12 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        System.out.print("Digite um número (entre 1 a 9): ");
        int n = away.nextInt();

        for (int way2 = 1; way2 <= n; way2++) {
            for (int way = 1; way <= way2; way++) {
                System.out.print(way);
            }
            for (int way = way2; way >= 1; way--) {
                System.out.print(way);
            }
            System.out.println();
        }
    }
}
