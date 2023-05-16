import java.util.Scanner;

public class c11ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorHora;
        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = input.nextDouble();

        String nome, funcao;
        int horasTrabalhadas;
        double premio, salario;

        double maiorSalario = 0;
        String nomeMaiorSalario = "";
        String funcaoMaiorSalario = "";

        int qtdPremio1000 = 0;
        int qtdPremio10PorHora = 0;
        int qtdPremio100Por10Horas = 0;

        int qtdPessoas = 0;
        double somaHoras = 0;
        double somaSalarios = 0;

        while (true) {
            System.out.print("Digite o nome do trabalhador (ou 'fim' para encerrar): ");
            nome = input.next();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite a função do trabalhador: ");
            funcao = input.next();

            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horasTrabalhadas = input.nextInt();

            if (horasTrabalhadas <= 100) {
                premio = 1000;
            } else if (horasTrabalhadas <= 500) {
                premio = horasTrabalhadas * 10;
            } else {
                premio = Math.floor(horasTrabalhadas / 10) * 100;
            }

            salario = horasTrabalhadas * valorHora + premio;

            System.out.printf("O trabalhador %s, da função %s, tem a receber R$%.2f\n", nome, funcao, salario);

            qtdPessoas++;
            somaHoras += horasTrabalhadas;
            somaSalarios += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
                funcaoMaiorSalario = funcao;
            }

            if (premio == 1000) {
                qtdPremio1000++;
            } else if (premio == horasTrabalhadas * 10) {
                qtdPremio10PorHora++;
            } else {
                qtdPremio100Por10Horas++;
            }
        }

        double mediaHoras = somaHoras / qtdPessoas;

        System.out.printf("Média de horas trabalhadas por pessoa no projeto: %.2f\n", mediaHoras);
        System.out.printf("Pessoa que receberá o maior salário: %s, da função %s, com salário de R$%.2f\n", nomeMaiorSalario, funcaoMaiorSalario, maiorSalario);
        System.out.printf("Quantidade de pessoas com prêmio de R$1.000,00: %d\n", qtdPremio1000);
        System.out.printf("Quantidade de pessoas com prêmio de R$10,00 por hora trabalhada: %d\n", qtdPremio10PorHora);
        System.out.printf("Quantidade de pessoas com prêmio de R$100,00 por cada 10 horas trabalhadas completas: %d\n", qtdPremio100Por10Horas);
    }
}
