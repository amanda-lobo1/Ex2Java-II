package ex2java;

public class Ex2JavaIIA {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int resultado = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
