
      // Faça um programa para calcular e imprimir o valor da série abaixo.


      public class c09exem01 {
          public static void main(String[] args) {
              double num= 1 , den = 50 , serie=0 ;

              for ( int way=1 ; way <=50 ; way++) {
                  serie += num / den;
                  num ++; //  "num++" aumenta o valor de "num" em 1 unidade,
                  den --; //  "den--" diminui o valor de "den" em 1 unidade.
              }
              System.out.println("Qual valor da Série =" +serie);
          }
}