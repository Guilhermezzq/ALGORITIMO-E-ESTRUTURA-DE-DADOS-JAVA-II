import java.util.Scanner;

public class c08ex24 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double soma = 0 ;


        for (int way =1 ; way <= 99 ; way+=2){

            soma += (1.0 / 3.0) * Math.pow(2,way);

        }

        System.out.println("Valor da Serie: " +soma);

    }
}

