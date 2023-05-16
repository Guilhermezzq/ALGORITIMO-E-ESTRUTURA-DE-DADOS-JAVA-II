import java.util.Scanner;

public class c11ex10 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        System.out.println("Digite um número (entre 1 a 9): ");
        int n = away.nextInt();

        String simbolo = "EMGE ";

        for ( int way2= 1 ; way2<= n ; way2++){
            for (int way = 1 ; way <= way2; way++)

                System.out.print( simbolo+ "");
            System.out.println();
        }
    }
}
