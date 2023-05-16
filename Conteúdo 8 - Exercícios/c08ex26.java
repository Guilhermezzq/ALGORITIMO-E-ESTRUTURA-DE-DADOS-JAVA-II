import java.util.Scanner;

public class c08ex26 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);



        String simbolo = "*";


        for (int way2 = 1; way2 <= 10; way2++) {
            for (int way = 1; way <= way2; way++) {
                System.out.print(" ");
            }
            System.out.println(simbolo +"");
        }

        for (int way2 = 10; way2 >= 1; way2--) {
            for (int way = 1; way <= way2; way++) {
                System.out.print(" ");
            }
            System.out.println(simbolo +"");
        }


    }
}
