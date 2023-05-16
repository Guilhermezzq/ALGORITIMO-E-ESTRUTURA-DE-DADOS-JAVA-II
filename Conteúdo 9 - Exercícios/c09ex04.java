
import java.util.Scanner;

public class c09ex04 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos;
        double num , den , serie = 0;

        System.out.print("Quantos termos terá a série? ");
        termos = away.nextInt();

        for (int way = 1; way <= termos ; way++) {
            num = (way * 4 - 3) * ( way * 4 - 2 );
            den = (way * 4 - 1) * ( way * 4 );
            serie += num / den;
         }

        serie = Math.sqrt(serie);
        System.out.println("Valor da Série = " + serie);
        away.close();
    }
}
