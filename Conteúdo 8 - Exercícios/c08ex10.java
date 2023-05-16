import java.util.Scanner;

public class c08ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de insumos consumidos no projeto: ");
        int numInsumos = input.nextInt();
        input.nextLine(); // Limpa o buffer

        String[] nomes = new String[numInsumos];
        double[] precosUnitarios = new double[numInsumos];
        int[] quantidades = new int[numInsumos];
        double[] custosParciais = new double[numInsumos];
        double custoTotal = 0.0;
        double mediaCustosParciais = 0.0;
        String nomeMaiorCustoParcial = "";
        double maiorCustoParcial = 0.0;

        for (int i = 0; i < numInsumos; i++) {
            System.out.println("Insumo " + (i + 1) + ":");
            System.out.print("Digite o nome do insumo: ");
            nomes[i] = input.nextLine();
            System.out.print("Digite a quantidade consumida do insumo: ");
            quantidades[i] = input.nextInt();
            System.out.print("Digite o preço unitário do insumo: R$");
            precosUnitarios[i] = input.nextDouble();
            input.nextLine(); // Limpa o buffer

            custosParciais[i] = quantidades[i] * precosUnitarios[i];
            custoTotal += custosParciais[i];

            if (custosParciais[i] > maiorCustoParcial) {
                maiorCustoParcial = custosParciais[i];
                nomeMaiorCustoParcial = nomes[i];
            }
        }

        input.close();

        mediaCustosParciais = custoTotal / numInsumos;

        System.out.println("\nInsumos consumidos no projeto (" + numInsumos + "):\n");
        System.out.printf("%-10s %-10s %-18s %s\n", "Insumo", "Quant.", "Preço Unitário", "Custo Parcial");
        for (int i = 0; i < numInsumos; i++) {
            System.out.printf("%-10s %-10d R$%-16.2f R$%.2f\n", nomes[i], quantidades[i], precosUnitarios[i], custosParciais[i]);
        }

        System.out.printf("\n%-30s R$%.2f\n", "Custo Total", custoTotal);
        System.out.printf("%-30s R$%.2f\n", "Média dos Custos Parciais", mediaCustosParciais);
        System.out.printf("%-30s %s\n", "Nome do Insumo de maior custo parcial", nomeMaiorCustoParcial);
    }
}
