import java.util.Scanner;

public class c11ex13 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double serie = 0 , num, den ;
        int termos , way = 0;

        System.out.print("Informe o número de termos: ");
        termos = away.nextInt();

        while (way < termos) {
              way++;

            num = (way * Math.pow(way * 9.0 + 1, way * 2.0));
            den = Math.pow(7, way - 1);
            serie += num / den;

        }

        serie = 71 + Math.cbrt(serie);

        System.out.println("Série: "+ serie);
        away.close();

    }
}
