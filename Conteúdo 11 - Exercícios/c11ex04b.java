import java.util.Scanner;

public class c11ex04b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, sexo;
        int idade, pontos = 0, totalMulheres = 0, totalHomens = 0, qtdMultas = 0, idadeTotal = 0;
        double valorMulta, valorTotal = 0;
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;

        System.out.println("Digite os dados das multas aplicadas:");
        while (true) {
            System.out.print("Nome do condutor (ou X para encerrar): ");
            nome = input.nextLine();
            if (nome.equalsIgnoreCase("X")) {
                break;
            }

            System.out.print("Idade do condutor: ");
            idade = Integer.parseInt(input.nextLine());
            idadeTotal += idade;

            System.out.print("Sexo do condutor (M/F): ");
            sexo = input.nextLine();
            if (sexo.equalsIgnoreCase("M")) {
                totalHomens++;
            }
            else {
                if (pontos == 7) {
                    totalMulheres++;
                }
            }

            System.out.print("Quantidade de pontos perdidos na carteira: ");
            pontos = Integer.parseInt(input.nextLine());

            System.out.print("Valor da multa: ");
            valorMulta = Double.parseDouble(input.nextLine());
            valorTotal += valorMulta;

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            qtdMultas++;
        }

        double idadeMedia = idadeTotal / (double)qtdMultas;
        double percentualHomens = (totalHomens / (double)qtdMultas) * 100;

        System.out.printf("Idade média dos condutores: %.2f\n", idadeMedia);
        System.out.printf("Valor total das multas aplicadas: R$ %.2f\n", valorTotal);
        System.out.printf("Percentual de homens multados: %.2f%%\n", percentualHomens);
        System.out.printf("Quantidade de mulheres que perderam 7 pontos na carteira: %d\n", totalMulheres);
        System.out.printf("Nome e idade da pessoa mais velha: %s (%d anos)\n", nomeMaisVelho, idadeMaisVelho);

        input.close();
    }
}
