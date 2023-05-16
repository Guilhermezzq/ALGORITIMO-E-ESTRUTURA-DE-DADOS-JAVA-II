import java.util.Scanner;

public class c08ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor de X: ");
        String xString = scanner.next();
        System.out.print("Digite o valor de Y: ");
        String yString = scanner.next();
        scanner.close();

        int x = Integer.parseInt(xString);
        int y = Integer.parseInt(yString);


        System.out.println(x + "^" + y + " ");
    }

}
