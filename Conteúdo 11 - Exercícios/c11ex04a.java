import java.util.Scanner;

public class c11ex04a {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadeMultas = 230;
        int pontosTotal = 0;
        int quantidadeMulheresSetePontos = 0;
        int quantidadeHomensMultados = 0;
        int idadeMaior = 0;
        String nomeMaior = "";

        double valorTotal = 0.0;
        double percentualHomensMultados = 0.0;

        int contador = 1;

        while (contador <= quantidadeMultas) {
            System.out.println("Digite o nome do condutor:");
            String nome = input.nextLine();

            System.out.println("Digite a idade do condutor:");
            int idade = input.nextInt();
            input.nextLine();

            System.out.println("Digite o sexo do condutor (M/F):");
            char sexo = input.nextLine().charAt(0);

            System.out.println("Digite a quantidade de pontos perdidos na carteira:");
            int pontosPerdidos = input.nextInt();
            input.nextLine();

            System.out.println("Digite o valor da multa:");
            double valorMulta = input.nextDouble();
            input.nextLine();

            pontosTotal += pontosPerdidos;
            valorTotal += valorMulta;

            if (sexo == 'M') {
                quantidadeHomensMultados++;
            }

            if (sexo == 'F' && pontosPerdidos == 7) {
                quantidadeMulheresSetePontos++;
            }

            if (idade > idadeMaior) {
                idadeMaior = idade;
                nomeMaior = nome;
            }

            contador++;
        }

        if (quantidadeMultas > 0) {
            double idadeMedia = (double) idadeMaior / quantidadeMultas;
            percentualHomensMultados = (double) quantidadeHomensMultados / quantidadeMultas * 100.0;

            System.out.println("Idade média dos condutores: " + idadeMedia);
            System.out.println("Valor total das multas aplicadas: R$ " + valorTotal);
            System.out.println("Percentual de homens multados: " + percentualHomensMultados + "%");
            System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: " + quantidadeMulheresSetePontos);
            System.out.println("Nome e idade da pessoa mais velha: " + nomeMaior + ", " + idadeMaior + " anos.");
        } else {
            System.out.println("Não foram registradas multas.");
        }
    }
}
