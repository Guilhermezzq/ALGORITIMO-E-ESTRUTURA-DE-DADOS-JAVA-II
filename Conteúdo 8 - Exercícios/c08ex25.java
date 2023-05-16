import java.util.Scanner;

public class c08ex25 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);


        String simbolo = "*";

        for ( int way2= 1 ; way2<= 10 ; way2++){
            for (int way = 1 ; way <= way2; way++)

                System.out.print( simbolo+ "");
            System.out.println();
        }

        for (int way2= 10; way2 >= 1; way2--){
            for (int way = 1; way <=way2 ; way++)
                System.out.print(simbolo + "");
            System.out.println();
        }
    }
}
