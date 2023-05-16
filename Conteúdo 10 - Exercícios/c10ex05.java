import java.util.Scanner;

public class c10ex05 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double altura, peso ;
        int qtdPessoas = 0;
        int qtdMulheres = 0;
        int mulheresPesoMenor60 = 0;
        double  somaAlturasHomens = 0, alturaMediaHomens;
        int qtdHomens = 0;
        String sexo ;




        do {
            System.out.print("Digitde a altura :");
            altura = away.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Digite o peso da pessoa? ");
            peso = away.nextDouble();
            away.nextLine();

            System.out.print("Digite o sexo da pessoa (M/F): ");
            sexo = away.nextLine();

            qtdPessoas++;



            if (sexo.equalsIgnoreCase("F")) {
                qtdMulheres++;

                if (peso < 60) {
                    mulheresPesoMenor60++;
                }
            } else if (sexo.equalsIgnoreCase("M")) {
                somaAlturasHomens += altura;
                qtdHomens++;
            }
        } while (true) ;

            alturaMediaHomens = somaAlturasHomens / qtdHomens;

            System.out.println("Quantidade de pessoas pesquisadas: " + qtdPessoas);
            System.out.println("Quantidade de mulheres: " + qtdMulheres);
            System.out.printf("Altura média dos homens: %.3f\n...", alturaMediaHomens);
            System.out.println("Quantidade de mulheres com peso menor que 60: " + mulheresPesoMenor60);

            away.close();
        }
    }
