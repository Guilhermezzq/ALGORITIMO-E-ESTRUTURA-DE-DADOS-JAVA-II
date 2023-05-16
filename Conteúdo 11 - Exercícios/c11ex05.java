import java.util.Scanner;

public class c11ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, qtdeIngles = 0;
        double mensalidade, mensalidadeTotal = 0;
        int qtdeAlunos = 0, qtdeOpcao[] = {0, 0, 0};
        String nome;

        System.out.println("Línguas disponíveis:");
        System.out.println("1 - Inglês (R$ 100,00/mês)");
        System.out.println("2 - Francês (R$ 150,00/mês)");
        System.out.println("3 - Espanhol (R$ 120,00/mês)\n");

        while (true) {
            System.out.print("Digite o nome do aluno: ");
            nome = sc.nextLine();

            if (nome.equals("FIM")) {
                break;
            }

            System.out.print("Digite o código da opção escolhida: ");
            codigo = sc.nextInt();

            while (codigo < 1 || codigo > 3) {
                System.out.print("Código inválido. Digite novamente: ");
                codigo = sc.nextInt();
            }

            switch (codigo) {
                case 1:
                    mensalidade = 100.0;
                    qtdeIngles++;
                    break;
                case 2:
                    mensalidade = 150.0;
                    break;
                default:
                    mensalidade = 120.0;
            }

            sc.nextLine(); // limpar o buffer do teclado

            System.out.printf("Aluno: %s. Mensalidade: R$ %.2f.%n", nome, mensalidade);

            mensalidadeTotal += mensalidade;
            qtdeAlunos++;
            qtdeOpcao[codigo - 1]++;
        }

        double mensalidadeMedia = mensalidadeTotal / qtdeAlunos;

        System.out.printf("%nQuantidade de alunos matriculados em Inglês: %d.%n", qtdeIngles);
        System.out.printf("Média das mensalidades: R$ %.2f.%n", mensalidadeMedia);
        System.out.println("Valor total das mensalidades por opção:");
        System.out.printf("Inglês: R$ %.2f.%n", qtdeOpcao[0] * 100.0);
        System.out.printf("Francês: R$ %.2f.%n", qtdeOpcao[1] * 150.0);
        System.out.printf("Espanhol: R$ %.2f.%n", qtdeOpcao[2] * 120.0);
    }
}
