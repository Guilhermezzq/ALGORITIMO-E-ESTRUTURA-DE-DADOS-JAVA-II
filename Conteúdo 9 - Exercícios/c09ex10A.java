import java.util.Scanner;

public class c09ex10A {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double serie = 0 , num , den;
        int termos;
        System.out.print("Informe a quantidade de termos da serie? ");
        termos = away.nextInt();

        for (int way = 1; way <= termos; way++) {

            num = (way * 1);
            den = (Math.sqrt(way * 2));
            serie += num / den;

        }

        System.out.println("Valor da Serie =" + serie);
        away.close();
    }
}
