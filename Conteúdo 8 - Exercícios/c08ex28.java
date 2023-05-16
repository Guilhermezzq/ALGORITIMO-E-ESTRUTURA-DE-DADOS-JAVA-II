import java.util.Scanner;

public class c08ex28 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int soma = 0 , tresPordutos = 0 , count = 0;

        for (int way = 1; way <= 1000; way++) {

            tresPordutos = way * (way + 1) * (way +2);
            if (tresPordutos <= 1000) {
                System.out.println(+tresPordutos);
                soma += tresPordutos;
                count++;

            } else {
                break;
            }
        }

        double media = (double) soma / count;
        System.out.println("A media dos numeros triangulares e: " + media);
    }
}
