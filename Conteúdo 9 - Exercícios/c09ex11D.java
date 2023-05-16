import java.util.Scanner;

public class c09ex11D {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double num , den , serie = 0 ;

        System.out.print("Informe a quantidade de repetições: ");
        termos = away.nextInt();

        for (int way = 1; way <= termos ; way++) {

            num = Math.pow(way , 3.0);
            den = Math.pow(10.0,way -1) ;
            serie += num / den ;


        }
        System.out.printf("Valor da Série= %.6f", serie);
        away.close();
    }
}
