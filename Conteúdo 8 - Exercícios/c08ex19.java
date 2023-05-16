import java.util.Scanner;

public class c08ex19 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int soma = 0 , progressao ;

        for (int way = 1; way <= 100; way++){

            progressao = way * way;
            System.out.println(progressao);
            soma+= progressao;

        }

        System.out.print("Soma dos 100 primeiros termos: " +soma);
        away.close();
    }
}
