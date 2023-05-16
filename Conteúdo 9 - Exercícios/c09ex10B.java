import java.util.Scanner;

public class c09ex10B {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos;
        double den, num , serie = 0 ;

        System.out.print("Digite a quantidade de termos?");
        termos = away.nextInt();

        for (int way = 1; way <= termos; way++) {

             num = ( way * 2);
             den = ( way * 3);
             serie += num / den ;


        }

         serie = 1 + Math.sqrt(serie);
        System.out.println("Valor da serie? " +serie);
        away.close();

    }
}
