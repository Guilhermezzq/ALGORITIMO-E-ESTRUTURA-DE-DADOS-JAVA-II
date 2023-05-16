import java.util.Scanner;

public class c09ex10E {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double serie = 0 , num, den ;

        System.out.print("Digite a quantidade de termos: ");
        termos = away.nextInt();

        for (int way = 1; way <= termos; way++) {

            num = ( way * 1.0);
            den = (3.0) * (way * 2);
            serie += num / den;

        }

        System.out.printf("Valor da Série= %.5f", serie);
        away.close();

    }
}
