import java.util.Scanner;

public class c08ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String cargo;
        double salario;
        int idade;
        double salarioMaximo = 0;
        String nomeCargoSalarioMaximo = "";
        double somaSalariosMenores18 = 0;
        int contadorMenores18 = 0;

        for (int i = 1; i <= 1000; i++) {
            System.out.println("Funcionário #" + i);

            System.out.print("Digite o nome: ");
            nome = input.nextLine();

            System.out.print("Digite o cargo: ");
            cargo = input.nextLine();

            System.out.print("Digite o salário: ");
            salario = input.nextDouble();

            System.out.print("Digite a idade: ");
            idade = input.nextInt();
            input.nextLine();

            if (salario > 10000 && idade > 50) {
                System.out.println("SÊNIOR");
            }

            if (idade <= 18) {
                somaSalariosMenores18 += salario;
                contadorMenores18++;
            }

            if (salario > salarioMaximo) {
                salarioMaximo = salario;
                nomeCargoSalarioMaximo = nome + " - " + cargo;
            }
        }

        System.out.println("Média dos salários dos funcionários com até 18 anos: " + (somaSalariosMenores18 / contadorMenores18));
        System.out.println("Funcionário com o maior salário: " + nomeCargoSalarioMaximo);

        input.close();
    }
}
