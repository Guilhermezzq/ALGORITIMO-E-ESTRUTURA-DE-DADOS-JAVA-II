import java.util.Scanner;

public class c09ex11E {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double num, den , serie = 0 ;

        System.out.print("Informe a quantidade de termos: ");
        termos = away.nextInt();

        for (int way = 1 ; way <= termos; way++) {

            num = Math.pow(way ,2.0) * Math.sqrt(2 * way + 3.0 );
            den = Math.pow(way * 1.0 + 1, way);
            serie += num / den ;

        }
        serie = 2 / 3.0 * serie ;
        System.out.printf("Valor da Série= %.6f", serie);
        away.close();
    }
}
