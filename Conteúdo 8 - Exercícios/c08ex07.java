import java.util.Scanner;

public class c08ex07 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);
        String  nome;
        int idade ;
        int menor12 = 0;
        int maior30 = 0;
        int somaIdades = 0;
        int numeroAlunos = 0;
        double mediaIdades;

        for (int way=1; way <= 5; way++) {
            System.out.println("Qual nome do aluno? ");
            nome = away.nextLine();

            System.out.println("Qual a idade do aluno? ");
            idade = away.nextInt();
            away.nextLine();

            if (idade <=12){
                menor12++;
            } else if (idade > 30){
                maior30++;
            }
            somaIdades += idade;
            numeroAlunos++;
        }

        mediaIdades = (double) somaIdades / numeroAlunos ;

        System.out.printf("Alunos que tem até 12 anos = %d\n", menor12);
        System.out.printf("Alunos que tem acima de 30 anos = %d\n", maior30);
        System.out.printf("Média das idades informadas = %.1f\n", mediaIdades);

    }
}

