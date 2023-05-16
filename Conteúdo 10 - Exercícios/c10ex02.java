
import java.util.Scanner;

public class c10ex02 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double media = 0, valor, total = 0;
        int cont = 0, acimaDe1000 = 0;

        System.out.println("Digite (para finalizar os valores recebidos 0):");

        do {
            valor = away.nextDouble();
            if (valor != 0) {
                total += valor;
                cont++;
                if (valor > 1000) {
                    acimaDe1000++;
                }
            }
        } while (valor != 0);

        if (cont > 0) {
            media = total / cont;
            System.out.printf("Valor total recebido = R$%.2f\n", total);
            System.out.printf("Média dos valores recebidos = R$%.2f\n", media);
            System.out.println("Quantidade de valores recebidos acima de R$1000,00 = " + acimaDe1000);

        }

        away.close();
    }

}

