package ex3java;

public class Pereciveis extends Produto{
    private int diasParaVencer;


    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos){
        double desconto = quantidadeDeProdutos * super.getPreco();
        if (this.diasParaVencer == 1){
            return desconto/4;
        } else if (this.diasParaVencer == 2) {
            return desconto/3;
        } else if (this.diasParaVencer == 3) {
            return desconto/2;
        }
        return super.calcular(quantidadeDeProdutos);
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
