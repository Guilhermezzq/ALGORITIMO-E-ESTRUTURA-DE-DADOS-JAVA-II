import java.util.Scanner;

public class c11ex02c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalBronze = 0;
        int totalPrata = 0;
        int totalOuro = 0;
        double totalAplicacoes = 0.0;
        double totalAplicacoesBronze = 0.0;
        double menorAplicacao = Double.MAX_VALUE;
        String nomeMenorAplicacao = "";

        boolean flagFicticio = false;

        while (!flagFicticio) {
            System.out.print("Nome do aplicador: ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("X")) {
                flagFicticio = true;
                continue;
            }

            System.out.print("Valor da aplicação: ");
            double valor = Double.parseDouble(sc.nextLine().replace(",", "."));

            String categoria;
            if (valor <= 1000.0) {
                categoria = "BRONZE";
                totalBronze++;
                totalAplicacoesBronze += valor;
            } else if (valor <= 5000.0) {
                categoria = "PRATA";
                totalPrata++;
            } else {
                categoria = "OURO";
                totalOuro++;
            }

            totalAplicacoes += valor;

            if (valor < menorAplicacao) {
                menorAplicacao = valor;
                nomeMenorAplicacao = nome;
            }

            System.out.printf("Nome do Aplicador   Valor da Aplicação    Categoria%n");
            System.out.printf("%-20sR$ %-20.2f%s%n", nome, valor, categoria);
        }

        System.out.printf("Total de Bronze = %d%n", totalBronze);
        System.out.printf("Total de Prata = %d%n", totalPrata);
        System.out.printf("Total de Ouro = %d%n", totalOuro);

        if (totalBronze > 0) {
            double mediaBronze = totalAplicacoesBronze / totalBronze;
            System.out.printf("Média das aplicações dos clientes Bronze = R$ %.2f%n", mediaBronze);
        }

        System.out.printf("Volume total das aplicações = R$ %.2f%n", totalAplicacoes);
        System.out.printf("Nome do aplicador de menor aplicação = %s%n", nomeMenorAplicacao);

        sc.close();
    }
}
