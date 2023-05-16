import java.util.Scanner;

public class c08ex31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de engenheiros pesquisados: ");
        int quantidadeEngenheiros = sc.nextInt();

        String nomeMenorSalario = "";
        String cargoMenorSalario = "";
        double salarioMenor = Double.MAX_VALUE;
        double somaSalariosAdministrador = 0;
        int quantidadeSalariosAcimaDoMinimo = 0;
        int quantidadeOutrosAcimaDe5000 = 0;

        for (int i = 0; i < quantidadeEngenheiros; i++) {
            sc.nextLine(); //

            System.out.println("\nEngenheiro " + (i + 1));
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite o salário bruto: ");
            double salario = sc.nextDouble();
            System.out.print("Digite o código do cargo (C/P/O/A/X): ");
            char codigo = sc.next().charAt(0);

            String cargo = "";
            double salarioMinimo = 0;

            switch (codigo) {
                case 'C':
                    cargo = "Engenheiro Calculista";
                    salarioMinimo = 2500.00;
                    break;
                case 'P':
                    cargo = "Engenheiro Projetista";
                    salarioMinimo = 4650.00;
                    break;
                case 'O':
                    cargo = "Engenheiro de Obra";
                    salarioMinimo = 3200.00;
                    break;
                case 'A':
                    cargo = "Engenheiro Administrador";
                    salarioMinimo = 5100.00;
                    somaSalariosAdministrador += salario;
                    break;
                case 'X':
                    cargo = "Outros";
                    break;
                default:
                    System.out.println("Código de cargo inválido. Tente novamente.");
                    i--;
                    continue;
            }

            if (salario < salarioMinimo) {
                System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
            }

            if (salario >= salarioMinimo && codigo != 'X') {
                quantidadeSalariosAcimaDoMinimo++;
            }

            if (cargo.equals("Outros") && salario > 5000.00) {
                quantidadeOutrosAcimaDe5000++;
            }

            if (salario < salarioMenor) {
                salarioMenor = salario;
                nomeMenorSalario = nome;
                cargoMenorSalario = cargo;
            }
        }

        System.out.printf("\nMédia dos salários dos Administradores: R$%.2f\n", somaSalariosAdministrador / 3);
        System.out.println("Quantidade de salários acima do mínimo: " + quantidadeSalariosAcimaDoMinimo);
        System.out.println("Quantidade de engenheiros de cargo 'Outros' que recebem acima de R$5000: " + quantidadeOutrosAcimaDe5000);
        System.out.println("Nome, cargo e salário do engenheiro de menor salário: " + nomeMenorSalario + ", " + cargoMenorSalario + ", R$" + salarioMenor);

        sc.close();
    }
}
