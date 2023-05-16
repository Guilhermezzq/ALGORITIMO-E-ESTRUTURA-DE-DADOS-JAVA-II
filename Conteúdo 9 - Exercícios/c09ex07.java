import java.util.Scanner;

public class c09ex07 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double num , den , serie = 0;

        for (int way = 1; way <= 6 ; way++) {

            num = ( way * 2 -2) + ( way * 3);
            den = ( way * 6 + 1);
            serie += num / den ;

        }

        System.out.println("Valor da Série = " +serie);
        away.close();
    }
}
