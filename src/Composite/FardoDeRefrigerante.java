package Composite;

import java.util.ArrayList;
import java.util.List;

public class FardoDeRefrigerante implements Produto {
    private String nome;
    private List<Produto> unidades; // A lista deve ser do tipo da Interface Comum (Produto)

    public FardoDeRefrigerante(String nome) {
        this.nome = nome;
        this.unidades = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        unidades.add(produto);
    }

    public void removerProduto(Produto produto) {
        unidades.remove(produto);
    }

    @Override
    public double calcularPreco() {
        System.out.println("\n[FARDO] Calculando preço do fardo de " + nome + "...");

        double precoTotal = 0.0;

        for (Produto produto : unidades) {
            precoTotal += produto.calcularPreco();
        }

        System.out.println("[FARDO] Preço total do fardo (" + unidades.size() + " un.): R$" + precoTotal);
        return precoTotal;
    }
}