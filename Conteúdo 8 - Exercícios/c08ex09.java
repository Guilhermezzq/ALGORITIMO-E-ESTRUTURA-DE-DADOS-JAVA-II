

import java.util.Scanner;

public class c08ex09 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int somaIdadesF = 0, somaIdadesM = 0, numeroPessoasM = 3 , numeroPessoasF = 2;
        double mediaIdadesF, mediaIdadesM;

        for (int way = 1; way <= 5; way++) {
            System.out.print("Digite um nome? ");
            String nome = away.nextLine();

            System.out.print("Digite a idade? ");
            int idade = away.nextInt();
            away.nextLine();

            System.out.print("Digite o sexo? (F para Feminino e M para Masculino)");
            String sexo = away.nextLine();

            if ("M".equalsIgnoreCase(sexo)) {
                somaIdadesM += idade;
            }
            if ("F".equalsIgnoreCase(sexo)) {
                somaIdadesF += idade;
            }

        }

        mediaIdadesM = (double) somaIdadesM / numeroPessoasM;
        System.out.println("Média das idades dos homens = " + mediaIdadesM);

        mediaIdadesF = (double) somaIdadesF / numeroPessoasF;
        System.out.println("Média das idades das mulheres = " + mediaIdadesF);

        away.close();
    }
}
