package Factory;

public class MensagemTriste implements Mensagem {
    private String txt = "Triste";

    @Override
    public String getTxt() {
        return this.txt;
    }

    @Override
    public void setTxt(String txt) {
        this.txt = txt;
    }
}
