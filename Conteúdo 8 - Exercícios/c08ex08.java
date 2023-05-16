import java.util.Scanner;

public class c08ex08 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        int falta,  contA = 0, faltas = 0, maior16 = 0, contadorAprovados = 0;
        double nota, mediaAprovados, notasAprovados = 0;

        for ( int way = 1; way <= 3; way++){
            System.out.print("Informe a nota do aluno? ");
            nota = away.nextDouble();

            System.out.print("Informe o número de falta dos alunos? ");
            falta = away.nextInt();



           if (nota >=65 && falta <= 16) {
                System.out.println("ALUNO APROVADO");
                contA++;
                notasAprovados += nota;
                contadorAprovados++;
            } else {
                System.out.println("ALUNO REPROVADO");
            } if (falta > 16) {
                maior16++;
            }

        }

        mediaAprovados = notasAprovados / contadorAprovados ;

        System.out.println("Média das notas dos aprovados = "+mediaAprovados);

        System.out.println("Quantidade de alunos com mais de 16 faltas = "+maior16);


        away.close();
    }
}
