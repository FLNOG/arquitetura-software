package Observer;

public class Cliente implements Notifica{
    private String nome;
    private String jogo;

    public Cliente(String nome, String jogo) {
        this.nome = nome;
        this.jogo = jogo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    @Override
    public void aviso(String jogo) {
        System.out.println(this.nome + ", seu jogo está disponível");
    }
}