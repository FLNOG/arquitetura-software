package Factory;

public class Main {
    public static void main(String[] args) {
        int valor = 1;
        Mensagem menssagem = MensagemFactory.getMensagem(valor);
        System.out.println(menssagem.getTxt());
    }
}