package Facade;

public class Main {
    public static void main(String[] args) {
        FacadeUser facade = new FacadeUser();
        boolean valida = facade.validaCadastro("Felipe","felipe@tecnbr", "1234567890");
        System.out.println(valida);
    }
}
