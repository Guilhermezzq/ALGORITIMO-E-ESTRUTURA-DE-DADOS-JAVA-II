import java.util.Scanner;

public class c10ex07 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double populacao, infectados = 1 , taxaDiaria = 0.003;
        int anos = 0, meses = 0, dias = 0;

        System.out.println("Informe a quantidade de pessoas na região: ");
        populacao = away.nextDouble();

        do {
            double txInfectados = infectados / populacao * taxaDiaria;

            double novosInfecados = txInfectados * populacao;

            infectados += novosInfecados;
            dias++;

            if (dias == 30) {
                meses++;
                dias = 0;
            } if (meses == 12) {
                anos++;
                meses= 0;
            }
        } while (infectados < populacao);

        System.out.println("Anos:" +anos);
        System.out.println("Meses:" +meses);
        System.out.println("Dias:" +dias);
        away.close();
    }
}
