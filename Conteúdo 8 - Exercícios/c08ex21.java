
import java.util.Scanner;

public class c08ex21 {
    public static void main(String[] args) {
        Scanner away = new Scanner(System.in);

        double altura ,calcIMC;
        int menor20 = 0, entre = 0, maior25= 0;
        String situacaoCorporea ;

        System.out.print("Qual altura em metros? ");
        altura = away.nextDouble();

        System.out.println("Peso | IMC | Situação Corpórea");
        System.out.println("-----------------------------");


        for (int way = 60 ; way <= 100; way++){

           double calcimc = way/ Math.pow(altura,2);


              if ( menor20 < 20 ){
                situacaoCorporea = "ABAIXO DO PESO";
            } if ( entre >= 20 && entre <= 25){
               situacaoCorporea =  "PESO IDEAL";
            } else{
               situacaoCorporea = "ACIMA DO PESO";
            }

            System.out.printf("%-5d| %.2f| %s%n" , way , calcimc , situacaoCorporea);

        }

        away.close();
    }
}

