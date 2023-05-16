import java.util.Scanner;

public class c08ex05 {
    public static void main(String[] args) {
        int[] votos = {0, 0, 0}; // vetor para armazenar os votos de cada candidato

        // loop para ler os votos dos eleitores
        for (int way = 1;  way<= 100; way++) {
            System.out.print("Digite o número do candidato (1 - Fulano, 2 - Ciclano, 3 - Beltrano): ");
            int voto = new Scanner(System.in).nextInt();

            // verifica o número do candidato e incrementa o contador de votos correspondente
            if (voto == 1) {
                votos[0]++;
            } else if (voto == 2) {
                votos[1]++;
            } else if (voto == 3) {
                votos[2]++;
            } else {
                System.out.println("Voto inválido!");
                way--; // decrementa o contador do loop para ler novamente o voto
            }
        }

        // exibe o resultado da apuração dos votos
        System.out.println("Resultado da apuração dos votos:");
        System.out.println("Fulano: " + votos[0] + " votos");
        System.out.println("Ciclano: " + votos[1] + " votos");
        System.out.println("Beltrano: " + votos[2] + " votos");

        // verifica o candidato com mais votos e exibe o resultado
        if (votos[0] > votos[1] && votos[0] > votos[2]) {
            System.out.println("O candidato vencedor é Fulano!");
        } else if (votos[1] > votos[0] && votos[1] > votos[2]) {
            System.out.println("O candidato vencedor é Ciclano!");
        } else {
            System.out.println("O candidato vencedor é Beltrano!");
        }
    }
}
