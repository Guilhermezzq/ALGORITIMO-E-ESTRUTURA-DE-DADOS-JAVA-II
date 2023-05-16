import java.util.Scanner;

public class c11ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal, numPessoas, totalPessoas = 0;
        int audiencia4 = 0, audiencia7 = 0, audiencia12 = 0;
        int maiorAudiencia = 0, canalMaisAssistido = 0;

        int numCasas = 0;
        while (numCasas < 100) {
            System.out.print("Digite o número do canal (4, 7 ou 12): ");
            canal = input.nextInt();

            System.out.print("Digite o número de pessoas assistindo: ");
            numPessoas = input.nextInt();

            if (canal == 4) {
                audiencia4 += numPessoas;
            } else if (canal == 7) {
                audiencia7 += numPessoas;
            } else if (canal == 12) {
                audiencia12 += numPessoas;
            }

            totalPessoas += numPessoas;

            numCasas++;
        }

        System.out.println("Audiência do canal 4: " + audiencia4 + " pessoas");
        System.out.println("Audiência do canal 7: " + audiencia7 + " pessoas");
        System.out.println("Audiência do canal 12: " + audiencia12 + " pessoas");

        if (totalPessoas > 0) {
            double porcentagem4 = (double) audiencia4 / totalPessoas * 100;
            double porcentagem7 = (double) audiencia7 / totalPessoas * 100;
            double porcentagem12 = (double) audiencia12 / totalPessoas * 100;

            System.out.printf("Porcentagem de audiência do canal 4: %.2f%%\n", porcentagem4);
            System.out.printf("Porcentagem de audiência do canal 7: %.2f%%\n", porcentagem7);
            System.out.printf("Porcentagem de audiência do canal 12: %.2f%%\n", porcentagem12);
        }

        if (audiencia4 > maiorAudiencia) {
            maiorAudiencia = audiencia4;
            canalMaisAssistido = 4;
        }
        if (audiencia7 > maiorAudiencia) {
            maiorAudiencia = audiencia7;
            canalMaisAssistido = 7;
        }
        if (audiencia12 > maiorAudiencia) {
            maiorAudiencia = audiencia12;
            canalMaisAssistido = 12;
        }

        System.out.println("Canal mais assistido: " + canalMaisAssistido);

        if (numCasas > 0) {
            double mediaPessoas = (double) totalPessoas / numCasas;
            System.out.printf("Média de pessoas assistindo TV: %.2f\n", mediaPessoas);
        }
    }
}
