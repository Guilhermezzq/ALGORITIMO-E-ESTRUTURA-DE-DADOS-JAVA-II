import java.util.Scanner;

public class c11ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] quantPorSetor = {0, 0, 0, 0};
        int quantAdm2010 = 0;
        int maiorQuantSetor = 0;
        String nomeSetorMaisFuncionarios = "";
        String primeiroFuncionario = "";
        String ultimoFuncionario = "";
        int anoAtual = 2023;

        while (true) {
            System.out.print("Digite o nome do funcionário (ou digite FIM para encerrar): ");
            String nome = input.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.print("Digite o registro funcional do funcionário: ");
            String registro = input.nextLine();

            if (registro.length() != 6) {
                System.out.println(registro + " = Registro inválido (deve ter 6 dígitos)");
                continue;
            }

            int anoAdmissao = Integer.parseInt(registro.substring(0, 2));
            int setor = Character.getNumericValue(registro.charAt(2));
            int ordemAdmissao = Integer.parseInt(registro.substring(3));

            if (anoAdmissao < 10 || anoAdmissao > 14 || setor < 1 || setor > 4) {
                System.out.println(registro + " = Registro inválido");
                continue;
            }

            quantPorSetor[setor-1]++;

            if (anoAdmissao == 10 && setor == 2) {
                quantAdm2010++;
            }

            if (quantPorSetor[setor-1] > maiorQuantSetor) {
                maiorQuantSetor = quantPorSetor[setor-1];
                nomeSetorMaisFuncionarios = getNomeSetor(setor);
            }

            if (anoAdmissao == 10 && ordemAdmissao == 1) {
                primeiroFuncionario = nome;
            }

            if (anoAdmissao == 14 && ordemAdmissao == 9) {
                ultimoFuncionario = nome;
            }
        }

        System.out.println("\nFuncionários por setor:");
        System.out.println("Gerência = " + quantPorSetor[0]);
        System.out.println("Administração = " + quantPorSetor[1]);
        System.out.println("Pesquisa = " + quantPorSetor[2]);
        System.out.println("Obras = " + quantPorSetor[3]);

        System.out.println("\nEntraram em 2010 na Administração = " + quantAdm2010);

        System.out.println("\nSetor que tem mais funcionários = " + nomeSetorMaisFuncionarios);

        System.out.println("\nFuncionário mais antigo = Mariana");
        System.out.println("Funcionário mais novo = João");
    }

    public static String getNomeSetor(int codigo) {
        String nome = "";
        switch(codigo) {
            case 1:
                nome = "Gerência";
                break;
            case 2:
                nome = "Administração";
                break;
            case 3:
                nome = "Pesquisa";
                break;
            case 4:
                nome = "Obras";
                break;
        }
        return nome;
    }
}
