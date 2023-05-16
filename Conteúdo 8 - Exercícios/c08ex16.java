import java.util.Scanner;

public class c08ex16 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int  soma= 0, cont = 0;

        for (int way = 1000 ; way <= 2000 ; way++){
            if (way % 2 != 0 ){
                soma += way;
                cont++;
            }
        }
        double media = (double) soma / cont ;
        System.out.println("Média dos números ímpares? " +media);
    }
}
