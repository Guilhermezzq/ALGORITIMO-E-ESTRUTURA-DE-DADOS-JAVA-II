import java.util.Scanner;


  public class c08ex04 {
      public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

          int alunos_ate_18_anos = 0, alunos_acima_de_18 = 0, cont1 = 0;


          for (int way = 1; way <= 5; way++) {
              System.out.println("Qual nome dos alunos da turma? ");
              String nome = teclado.nextLine();

              System.out.println("Qual idade dos alunos da turma? ");
              int idade = teclado.nextInt();
              teclado.nextLine();


              if (idade <= 18) {
                  alunos_ate_18_anos++;
              } else {
                  alunos_acima_de_18++;
              }

          }
                 System.out.println("Até 18: " + alunos_ate_18_anos);
                System.out.println("Acima de 18: " + alunos_acima_de_18);

                teclado.close();
      }
  }