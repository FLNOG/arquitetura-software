package EnumStrategy;

public class Pagar {
    private TipoPagamento pagamento;

    public Pagar(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setTipoPagamento(TipoPagamento novoPagamento) {
        this.pagamento = novoPagamento;
    }

    public double valorCompra(double valor){
        return pagamento.calculaTaxa(valor);
    }

    public String tipoPagamento(){
        return pagamento.formaPagamento();
    }
}