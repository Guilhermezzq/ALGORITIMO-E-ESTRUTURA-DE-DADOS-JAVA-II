import java.util.Scanner;

public class c11ex02b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicialização das variáveis
        String nome;
        double valorAplicado;
        int clientesBronze = 0, clientesPrata = 0, clientesOuro = 0;
        double somaAplicacoesBronze = 0, menorAplicacao = Double.MAX_VALUE, volumeTotal = 0;
        String nomeMenorAplicacao = "";

        // entrada de dados e processamento
        do {
            System.out.print("Nome do Aplicador: ");
            nome = sc.nextLine();

            if (nome.equals("Reynaldo Duarte")) {
                break; // encerra a repetição quando o último cliente é lido
            }

            System.out.print("Valor da Aplicação: ");
            valorAplicado = sc.nextDouble();
            sc.nextLine(); // consumir a quebra de linha pendente

            String categoria = "";
            if (valorAplicado <= 1000) {
                categoria = "BRONZE";
                clientesBronze++;
                somaAplicacoesBronze += valorAplicado;
            } else if (valorAplicado <= 5000) {
                categoria = "PRATA";
                clientesPrata++;
            } else {
                categoria = "OURO";
                clientesOuro++;
            }

            if (valorAplicado < menorAplicacao) {
                menorAplicacao = valorAplicado;
                nomeMenorAplicacao = nome;
            }

            volumeTotal += valorAplicado;

            System.out.printf("%s\t%.2f\t%s\n", nome, valorAplicado, categoria);
        } while (true);

        // saída de dados
        System.out.printf("Total de Bronze = %d\n", clientesBronze);
        System.out.printf("Total de Prata = %d\n", clientesPrata);
        System.out.printf("Total de Ouro = %d\n", clientesOuro);
        System.out.printf("Média das aplicações dos clientes Bronze = R$ %.2f\n",
                somaAplicacoesBronze / clientesBronze);
        System.out.printf("Volume total das aplicações = R$ %.2f\n", volumeTotal);
        System.out.printf("Nome do aplicador de menor aplicação = %s\n", nomeMenorAplicacao);

        sc.close();
    }
}
