import java.util.Scanner;

public class c08ex23 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);


        int soma = 0;
        int qtd = 0;


        for (int way = 1000; way <= 9999; way++) {

            if (Palindromo(way)) {
                System.out.println(way);
                soma += way;
                qtd++;
            }
        }

        if (qtd > 0) {
            double media = (double) soma / qtd;
            System.out.println("Media dos numeros palindromos:" + media);
        }
    }

    public static boolean Palindromo ( int way){
        String strway = Integer.toString(way);
        int inicio = 0;
        int fim = strway.length() - 1;
        while (inicio < fim) {
            if (strway.charAt(inicio) != strway.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

}


