package Adapter;

public class AdapterBanco extends User {
    private Banco banco;

    public AdapterBanco(Banco banco){
        this.banco = banco;
    }

    @Override
    public void pagamento(double valor){
        banco.pagamentoBanco(valor,"Professor");
    }
}