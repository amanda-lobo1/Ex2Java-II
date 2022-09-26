package ex3java;

public class Distribuidora {
    public static void main(String[] args) {
        Produto[] p = new Produto[5];

        p[0] = new Pereciveis("Banana", 4.0,3 );
        p[1] = new Pereciveis("Maçã", 3.25,1 );
        p[2] = new Pereciveis("Laranja", 6.40,60 );
        p[3] = new NaoPereciveis("Esponja", 1.5,"Limpeza" );
        p[4] = new NaoPereciveis("Bombril", 0.79, "Limpeza");

        System.out.println("Total: "+p[0].calcular(5));
        System.out.println("Total: "+p[1].calcular(5));
        System.out.println("Total: "+p[2].calcular(5));
        System.out.println("Total: "+p[3].calcular(5));
        System.out.println("Total: "+p[4].calcular(5));
    }
}
