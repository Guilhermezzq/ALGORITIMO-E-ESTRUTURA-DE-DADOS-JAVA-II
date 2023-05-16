import java.util.Scanner;

public class c09ex11A {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double num , den , serie = 0 ;

        System.out.print("Informe a quantidade de termo: ");
        termos = away.nextInt();
        for (int way = 1; way <= termos; way++) {

            num = (way * 1.0) + ( 7 * way - 6.0);
            den = Math.pow( 4, way - 1);
            serie += num / den;
        }

        serie = Math.cbrt(serie);
        System.out.printf("Valor da Série= %.6f", serie);
        away.close();
    }
}
