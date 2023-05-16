import java.util.Scanner;

public class c10ex01 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);
        double valor, multa, somaMulta = 0;
        int cont = 0;

        System.out.print("Digite os valores financeiros (para finalizar digite -1): ");


        do {
            valor = away.nextDouble();
            if (valor != -1) {
                multa = valor * 0.1;
                System.out.println("Multa para o valor " + valor + " = " + multa);
                somaMulta += multa;
                cont++;
            }
        } while (valor != -1);

        double media = somaMulta / cont;
        System.out.println("Média das multas =" +media);
            away.close();


        }
}

