package EnumStrategy;

public class Main {
    public static void main(String[] args) {
        double valor = 100;

        Pagar pagamento = new Pagar(TipoPagamento.PIX);
        System.out.println(pagamento.valorCompra(valor));
        System.out.println(pagamento.tipoPagamento());

        pagamento.setTipoPagamento(TipoPagamento.CARTAO);
        System.out.println(pagamento.valorCompra(valor));
        System.out.println(pagamento.tipoPagamento());

    }
}