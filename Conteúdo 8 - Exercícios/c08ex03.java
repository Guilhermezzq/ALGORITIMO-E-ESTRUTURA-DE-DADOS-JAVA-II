
import java.util.Scanner;

public class c08ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int falta, contA= 0;
        double nota;



        for (int way=1; way <=3; way++) {
            System.out.print("Informe a nota do aluno: ");
            nota = teclado.nextDouble();

            System.out.print("Informe o numero de falta do aluno: ");
            falta = teclado.nextInt();

            if ( nota >= 65 && falta <=16){

                System.out.println("Aluno Aprovado");
                contA++;

            }
            else {
                System.out.println("Aluno reprovado");
            }
            System.out.println("Numero de alunos aprovados: " +contA);
            System.out.println("Numero de alunos reprovados: " +(3-contA));

        }
        teclado.close();
    }
}
