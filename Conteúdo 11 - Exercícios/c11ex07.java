import java.util.Scanner;

public class c11ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double media = 0;
        int qtdMaior = 0;

        for (int i = 1; i <= 121; i++) {
            System.out.print("Digite a temperatura do dia " + i + ": ");
            double temperatura = input.nextDouble();

            if (temperatura < menor) {
                menor = temperatura;
            }

            if (temperatura > maior) {
                maior = temperatura;
                qtdMaior = 1;
            } else if (temperatura == maior) {
                qtdMaior++;
            }

            media += temperatura;
        }

        media /= 121;

        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);
        System.out.println("Quantidade de dias com a maior temperatura: " + qtdMaior);
    }
}
