
import java.sql.SQLOutput;
import java.util.Scanner;

public class c08ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int falta, contA= 0;
        double nota;
        String resultado;


        for (int way=1;way <=3; way++) {
            System.out.print("Informe a nota do aluno: ");
            nota = teclado.nextDouble();

            System.out.print("Informe o numero de falta do aluno: ");
            falta = teclado.nextInt();

            if ( nota >= 65 && falta <=16){

                System.out.println("Aluno Aprovado");


            }
            else {
                if (nota == (-1))
                    break;
                else {
                    System.out.println("Aluno Reprovado");

                }
            }


        }
        teclado.close();
    }
}
