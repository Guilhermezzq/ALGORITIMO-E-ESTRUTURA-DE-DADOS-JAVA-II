import java.util.Scanner;

public class c08ex12 {
    public static void main(String[] args) {
        // Quantidades de vendas e preços unitários dos produtos
        int qtdeVendasProduto1 = 0, qtdeVendasProduto2 = 0, qtdeVendasProduto3 = 0, qtdeVendasProduto4 = 0, qtdeVendasProduto5 = 0;
        double precoUnitProduto1 = 0, precoUnitProduto2 = 0, precoUnitProduto3 = 0, precoUnitProduto4 = 0, precoUnitProduto5 = 0;

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o código do modelo do equipamento vendido
        System.out.println("Informe o código do modelo do equipamento vendido (1 a 5) ou 0 para sair:");
        int codigoModelo = scanner.nextInt();

        // Loop para receber as quantidades de vendas e preços unitários dos produtos
        while (codigoModelo != 0) {
            switch (codigoModelo) {
                case 1:
                    System.out.print("Informe a quantidade de vendas do Produto 1: ");
                    qtdeVendasProduto1 = scanner.nextInt();
                    System.out.print("Informe o preço unitário do Produto 1: ");
                    precoUnitProduto1 = scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Informe a quantidade de vendas do Produto 2: ");
                    qtdeVendasProduto2 = scanner.nextInt();
                    System.out.print("Informe o preço unitário do Produto 2: ");
                    precoUnitProduto2 = scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Informe a quantidade de vendas do Produto 3: ");
                    qtdeVendasProduto3 = scanner.nextInt();
                    System.out.print("Informe o preço unitário do Produto 3: ");
                    precoUnitProduto3 = scanner.nextDouble();
                    break;
                case 4:
                    System.out.print("Informe a quantidade de vendas do Produto 4: ");
                    qtdeVendasProduto4 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o preço unitário do Produto 4: ");
                    precoUnitProduto4 = scanner.nextDouble();
                    break;
                case 5:
                    System.out.print("Informe a quantidade de vendas do Produto 5: ");
                    qtdeVendasProduto5 = scanner.nextInt();
                    System.out.print("Informe o preço unitário do Produto 5: ");
                    precoUnitProduto5 = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Código de modelo inválido. Por favor, informe um código válido (1 a 5) ou 0 para sair.");
                    break;
            }

            System.out.println("Informe o código do modelo do equipamento vendido (1 a 5) ou 0 para sair:");
            codigoModelo = scanner.nextInt();
        }

        // Cálculo do faturamento total
        double faturamentoTotal = qtdeVendasProduto1 * precoUnitProduto1 +
                qtdeVendasProduto2 * precoUnitProduto2 +
                qtdeVendasProduto3 * precoUnitProduto3 +
                qtdeVendasProduto4 * precoUnitProduto4 +
                qtdeVendasProduto5 * precoUnitProduto5;

        System.out.println("Faturamento total do período: R$" + faturamentoTotal);

    }
}
