public class c09ex02 {
    public static void main(String[] args) {
        double resultado = 0;

        for (int way = 1; way <= 100; way++) {
            resultado += (double) way / ((way * way) + way - 1);
        }

        System.out.println("Resultado da série: " + resultado);
    }
}
