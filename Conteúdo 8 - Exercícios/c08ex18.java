import java.util.Scanner;

public class c08ex18 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int numero = 0 , soma = 0;

        System.out.print("Informe um numero: ");
        numero = away.nextInt();
        for (int way = 1; way <= 9; way++) {


            soma = way * numero;

            System.out.println(""+ way +" x "+ numero +" = " +soma );
        }
    }
}