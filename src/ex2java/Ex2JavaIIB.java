package ex2java;

public class Ex2JavaIIB {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int resoltado = b / a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException ("Não pode ser dividido por zero!");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
