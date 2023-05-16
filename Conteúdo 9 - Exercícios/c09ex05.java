
import java.util.Scanner;

public class c09ex05 {

    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double num, den, serie = 0;

        System.out.print("Informe o número de termos da série: ");
        int termos = away.nextInt();

        for (int way = 1; way <= termos; way++) {

            num = (way * 2 -2) + (way * 3);
            den = ( way * 6 +1);

            serie += num / den ;
    }
        serie = 5 * serie ;
        System.out.println("Valor da serie = "+serie);

    }
}
