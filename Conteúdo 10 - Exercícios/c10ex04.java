
import java.util.Scanner;

public class c10ex04 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double taxaBDI, custoTotal = 0, custoParcial, valorBDI , precoFinal ;
        String nomeMaterial;
        int quantidade ;
        double precoUnitario ;



        System.out.print("Digite a taxa de BDI (em %): ");
        taxaBDI = away.nextDouble();


        do {
            System.out.print("Digite o nome do material (ou FIM para encerrar): ");
            nomeMaterial = away.next();

            if (!nomeMaterial.equals("FIM")) {

                System.out.print("Digite a quantidade utilizada: ");
                quantidade = away.nextInt();

                System.out.print("Digite o preço unitário: ");
                precoUnitario = away.nextDouble();


                custoParcial = quantidade * precoUnitario;
                custoTotal += custoParcial;

                System.out.println("Custo parcial do material " + nomeMaterial + ": R$ " + custoParcial);
            }

        } while (!nomeMaterial.equalsIgnoreCase("FIM")) ;

        valorBDI = custoTotal * taxaBDI / 100;
        precoFinal = custoTotal + valorBDI;

        System.out.println("Custo total: R$ " + custoTotal );
        System.out.println("BDI: R$ " + valorBDI);
        System.out.println("Preço final: R$ " +precoFinal);

        away.close();


    }
}


