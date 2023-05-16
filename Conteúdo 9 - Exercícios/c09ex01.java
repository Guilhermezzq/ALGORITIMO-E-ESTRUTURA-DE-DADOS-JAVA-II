public class c09ex01 {
    public static void main(String[] args) {
        double resultado = 0;
        int denominador = 1;

        for (int numerador = 37; numerador >= 1; numerador--) {
            resultado += (double) numerador * (numerador + 1) / denominador;
            denominador++;
        }

        System.out.println("Resultado da série: " + resultado);
    }
}
