import java.util.Scanner;

public class c08ex01 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        double area, raio;
        for (int way = 1; way <= 3; way++) {
            System.out.print("Qual valor de raio?");
            raio = teclado.nextDouble();
            area = 3.1416 * Math.pow(raio, 2);
            System.out.print("Area= " + area);
        }
        teclado.close();
    }
}