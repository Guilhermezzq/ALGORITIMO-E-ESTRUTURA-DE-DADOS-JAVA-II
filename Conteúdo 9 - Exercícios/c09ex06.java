
import java.util.Scanner;

public class c09ex06 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos;
        double num , den , serie = 0;

        System.out.print("Quantos termos terá a série? ");
        termos = away.nextInt();
        for (int way = 1; way <=termos; way++) {

            num = (way * 1);
            den = (Math.sqrt(way * 2));
            serie += num / den ;


        }

        serie = 10 + serie ;
        System.out.print("Valor da Serie = " +serie);
        away.close();

    }
}

