import java.util.Scanner;

public class c09ex08 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double num , den , serie = 0 ;

        System.out.print("Informe o valor do termo? ");
        int termos = away.nextInt();

        for (int way= 1; way <= termos; way++) {

            num = (way * 2 + 1) * (Math.sqrt(way * 4 + 1));
            den = Math.pow(5 , way);
            serie += num / den ;

        }
        serie = Math.pow(serie,2);
        System.out.println("Valor da Série = " +serie);
        away.close();
    }
}
