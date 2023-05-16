/*

public class c09ex12 {
    public static void main(String[] args) {
        int n = 10000;
        double pi = 0;
        for(int i = 0; i < n; i++) {
            double termo = 1.0 / (2 * i + 1);
            if(i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }
        }
        pi *= 4;
        System.out.printf("Valor de PI: %.4f", pi);
    }
}

*/
import java.util.Scanner;

public class c09ex12 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);
        int termos;
        double num, den, serie = 0;
        System.out.print("Informe a quantidade de termos: ");
        termos = away.nextInt();
        for (int way = 1; way <= termos; way++) {

            num = (1.0);
            den = (2.0 * way + 1);


            if (way % 2 == 0) {

                serie += num / den;
            } else {

                serie -= num / den;
            }
        }

        serie = 4 * (1 -  serie );
        System.out.printf("Valor de PI= %.10f", serie);
        away.close();
    }
}

