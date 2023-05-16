import java.util.Scanner;

public class c08ex17 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);
         double resultado;

        for (int way = 3 ; way <= 12 ; way++){

            resultado = Math.sqrt(Math.pow(way,2) -3);
            System.out.println("f("+ way +") = " +resultado);

        }
    }
}
