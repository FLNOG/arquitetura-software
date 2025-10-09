package Factory;

public class MensagemFactory {

    public static Mensagem getMensagem(int estado) {
        switch(estado) {
            case 1:
                return new MensagemFeliz();
            case 2:
                return new MensagemTriste();
            default:
                return new MensagemFeliz();
        }
    }
}