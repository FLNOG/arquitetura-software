package EnumStrategy;

public enum TipoPagamento {
    CARTAO{
        @Override
        double calculaTaxa(double valor) {
            return valor + (valor * 0.05);
        }

        @Override
        String formaPagamento(){
            return "Forma de pagamento: Cartão";
        }
    },
    PIX{
        @Override
        double calculaTaxa(double valor) {
            return valor + (valor * 0.03);
        }

        @Override
        String formaPagamento(){
            return "Forma de pagamento: PIX";
        }
    };

    abstract double calculaTaxa(double valor);
    abstract String formaPagamento();
}