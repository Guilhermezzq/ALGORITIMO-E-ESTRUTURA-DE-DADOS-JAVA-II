import java.util.Scanner;

public class c11ex02a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numClientes = 5;
        int totalBronze = 0, totalPrata = 0, totalOuro = 0;
        double somaBronze = 0, menorAplicacao = Double.MAX_VALUE, volumeTotal = 0;

        String nomeMenorAplicacao = "";

        System.out.println("Informe o nome e o valor aplicado para cada cliente:");

        while (numClientes > 0) {
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Valor aplicado: R$ ");
            double valor = input.nextDouble();
            input.nextLine(); // Limpa o buffer do teclado

            String categoria = "";
            if (valor <= 1000) {
                categoria = "BRONZE";
                totalBronze++;
                somaBronze += valor;
            } else if (valor <= 5000) {
                categoria = "PRATA";
                totalPrata++;
            } else {
                categoria = "OURO";
                totalOuro++;
            }

            if (valor < menorAplicacao) {
                menorAplicacao = valor;
                nomeMenorAplicacao = nome;
            }

            volumeTotal += valor;

            System.out.printf("%-20s R$ %-10.2f %-7s\n", nome, valor, categoria);

            numClientes--;
        }

        System.out.println("\nQuantidade de clientes por classificação:");
        System.out.printf("BRONZE: %d\n", totalBronze);
        System.out.printf("PRATA: %d\n", totalPrata);
        System.out.printf("OURO: %d\n", totalOuro);

        double mediaBronze = somaBronze / totalBronze;
        System.out.printf("\nMédia das aplicações dos clientes BRONZE: R$ %.2f\n", mediaBronze);
        System.out.printf("Volume total das aplicações: R$ %.2f\n", volumeTotal);
        System.out.printf("Nome do aplicador de menor aplicação: %s\n", nomeMenorAplicacao);
    }

}
