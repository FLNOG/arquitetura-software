package Factory;

public class MensagemFeliz implements Mensagem{
    private String txt = "Feliz";
    @Override
    public String getTxt() {
        return this.txt;
    }
    @Override
    public void setTxt(String txt) {
        this.txt = txt;
    }
}