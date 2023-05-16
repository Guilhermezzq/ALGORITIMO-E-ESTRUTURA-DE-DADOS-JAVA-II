import java.util.Scanner;

public class c09ex11F {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double num , den , serie = 0 ;

        System.out.println("Informe a quantidade de termos: ");
        termos = away.nextInt();

        for (int way = 1; way <= termos; way++) {

            num = (2.0 * way - 1) * Math.pow(2.0, way + 1) ;
            den = Math.pow(5.0 * way - 3, 2);
            serie += num / den ;


        }

        serie = 5 * Math.sqrt(serie);
        System.out.println("Valor da Serie = " + serie);
        away.close();
    }
}
