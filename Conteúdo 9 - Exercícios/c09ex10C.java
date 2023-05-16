import java.util.Scanner;

public class c09ex10C {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int termos ;
        double serie = 0 , num, den ;

        System.out.print("Infrme a quantidade de termos? ");
        termos = away.nextInt();
        for (int way = 1; way <= termos; way++) {

            num = (way *  5);
            den = (5);
            serie += num / den;


        }
        serie = (1 / 3.0 ) * Math.pow(serie,2);
        System.out.println("Valor da Série =" +serie);
        away.close();

    }
}
