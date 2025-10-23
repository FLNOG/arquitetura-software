package Adapter;

public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco();
        AdapterBanco adpterSantander = new AdapterBanco(santander);
        //User adapterSantanderUser = new AdapterBanco(santander);

        adpterSantander.pagamento(100);
    }
}
