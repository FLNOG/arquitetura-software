package Composite;

public class Refrigerante implements Produto {
    private String nome;
    private double precoUnitario;

    public Refrigerante(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPreco() {
        System.out.println("  [Refrigerante] Preço de uma unidade de " + nome + ": R$" + precoUnitario);
        return precoUnitario;
    }
}