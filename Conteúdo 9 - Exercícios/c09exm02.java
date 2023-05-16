
      /* Faça um programa para calcular e imprimir o valor da série abaixo.
      Gere 100 termos.
      𝑆𝐸𝑅𝐼𝐸𝐶=375+(1/2 +4/4 +9/6+ 16/8+ 25/10+ 36/12+ 49/14+...)^4

       */
public class c09exm02 {
          public static void main(String[] args) {
              double num= 1, den= 2,
              inc = 3, //   "inc" é usada para atualizar o valor de "num" em cada iteração
              serie=0; //  variável "serie" é usada para armazenar a soma das frações.

              for (int way=1; way <= 100; way++) {
                  serie += num / den;
                  num += inc;
                  den += 2 ;
                  inc += 2;
              }
              serie = 375 + Math.pow(serie,4);
              System.out.println("Valor da Série = " +serie);
          }
}
