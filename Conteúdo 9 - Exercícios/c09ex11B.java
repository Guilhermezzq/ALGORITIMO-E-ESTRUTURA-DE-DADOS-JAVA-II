import java.util.Scanner;

public class c09ex11B {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double num, den, serie = 0;

        System.out.print("Informe a quantidade de termos: ");
        termos = away.nextInt();
        for (int way = 1; way <= termos; way++) {

            num = ( 3 * way - 2 );
            den = Math.sqrt(3 * way + 4);
            serie += num / den ;
        }

        serie = 5 / 3.0 * serie ;
        System.out.printf("Valor da Série =%.6f ", serie);
    }
}
