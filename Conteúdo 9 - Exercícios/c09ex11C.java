import java.util.Scanner;

public class c09ex11C {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);
         int termos ;
         double num, den, serie = 0;

        System.out.print("Informe a quantidade de termos: ");
        termos = away.nextInt();

        for (int way = 1 ; way <= termos; way++) {

            num = (2.0 * way +1) * Math.sqrt(4.0 * way +1);
            den = Math.pow(5,way);
            serie += num/ den ;

        }

        serie = Math.pow(serie,2);
        System.out.printf("Valor da Série= %.6f", serie);
        away.close();
    }
}
