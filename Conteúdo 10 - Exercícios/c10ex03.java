import java.util.Scanner;

public class c10ex03 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double  raio , soma = 0 ;
        int
                cont = 0 , angulo;

        System.out.println("Digite (para finalizar o ultimo valor de R igual a -1)");

        do {
            System.out.println("Informe o valor da Raio? ");
            raio = away.nextDouble();

            if (raio != -1) {
                System.out.println("Informe o valor do Angulo? ");
                angulo = away.nextInt();

                soma += (angulo * Math.PI * Math.pow(raio, 2)) / 360.0;

            }
        } while ( raio != -1) ;


        System.out.printf("S = %.4f", soma);
    }
}
