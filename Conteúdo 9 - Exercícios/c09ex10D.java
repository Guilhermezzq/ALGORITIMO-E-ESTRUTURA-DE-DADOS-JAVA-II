import java.util.Scanner;

public class c09ex10D {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double den , num , serie = 0 ;

        System.out.print("Digita a quantidade de termos: ");
        termos = away.nextInt();

        for (int way =1 ; way <= termos; way++) {

            num = ( way * 1.0) + ( way * 1.0 - 1);
            den = Math.pow(way,2);
            serie += num / den ;

        }
        System.out.printf("Valor da Série = %.6f", serie);
        away.close();
    }
}
