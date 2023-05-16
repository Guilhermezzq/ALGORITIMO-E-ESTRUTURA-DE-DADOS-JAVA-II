import java.util.Scanner;

public class c09ex09 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double num, den , serie = 0 ;
        for (int way = 1 ; way <= 30; way++){

            num = Math.pow(9, way);
            den = ( way * 1 + 9 ) * Math.sqrt(2 ); // Precisa finalizar o codigo

            serie += num / den;

        }

        serie = Math.pow( 100 - serie, 3 ) ;
        System.out.println("Valor da Serie =" );
        away.close();
    }
}
