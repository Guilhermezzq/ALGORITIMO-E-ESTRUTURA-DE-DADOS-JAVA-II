import java.util.Scanner;

public class c10ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Informe o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Informe o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Informe o valor de C: ");
        double c = input.nextDouble();

        double d = 0;
        double xo, yo;

        do {
            System.out.print("Informe o valor de Xo: ");
            xo = input.nextDouble();

            System.out.print("Informe o valor de Yo: ");
            yo = input.nextDouble();


            d = Math.abs(a * xo + b * yo + c) / Math.sqrt(a * a + b * b);

            System.out.println("Distância: " + d);

        } while (d != 0);

        System.out.println("Ponto coincidente: (" + xo + ", " + yo + ")");

        input.close();
    }
}
