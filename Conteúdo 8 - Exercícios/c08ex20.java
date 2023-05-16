import java.util.Scanner;

public class c08ex20 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int n = 0 ;
        long soma = 0 ;

        System.out.println("Informo os n primeiros termos da progressao numerica: ");
         n = away.nextInt();

        for (int way = 0 ; way <= n; way++){

            long termos = (long) Math.pow(2,way);
            System.out.println(termos);
            soma += termos;




        }
        System.out.println("Soma dos primeiros termos: " +soma);

        away.close();
    }
}
