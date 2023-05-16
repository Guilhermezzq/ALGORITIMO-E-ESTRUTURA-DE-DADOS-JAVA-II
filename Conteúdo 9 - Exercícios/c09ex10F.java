import java.util.Scanner;

public class c09ex10F {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double num, den, serie = 0 ;

        System.out.print("Informe a quantidade de termos: ");
        termos = away.nextInt();

        for (int way = 1; way <= termos; way++) {

            num = Math.pow(way ,2.0);
            den = Math.pow(way * 2 , 2);
            serie += num / den ;
        }

        System.out.println("Valor da Série= " +serie);
        away.close();
    }
}
