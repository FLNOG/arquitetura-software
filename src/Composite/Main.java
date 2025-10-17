package Composite;

public class Main {
    public static void main(String[] args) {

        Produto cocaCola = new Refrigerante("Coca-Cola 2L", 8.00);
        Produto guarana = new Refrigerante("Guaraná 1.5L", 6.50);

        FardoDeRefrigerante fardoCoca = new FardoDeRefrigerante("Coca-Cola 6x2L");
        for (int i = 0; i < 6; i++) {
            fardoCoca.adicionarProduto(new Refrigerante("Coca-Cola 2L", 8.00));
        }

        FardoDeRefrigerante compraCompleta = new FardoDeRefrigerante("Carrinho de Compras");

        compraCompleta.adicionarProduto(guarana);   // Adiciona uma Folha
        compraCompleta.adicionarProduto(cocaCola);  // Adiciona outra Folha
        compraCompleta.adicionarProduto(fardoCoca); // Adiciona um Composto (o fardo)

        System.out.println("====== INICIANDO CÁLCULO DA COMPRA ======");
        double total = compraCompleta.calcularPreco();
        System.out.println("\n====== TOTAL GERAL DA COMPRA: R$" + total + " ======");
    }
}