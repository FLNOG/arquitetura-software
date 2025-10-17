package Observer;

public class Main {
    public static void main(String[] args) {
        Gestor interessados = new Gestor();
        Jogador jogador1 = new Jogador("Felipe", "CS");
        interessados.adiciona((Notifica)jogador1);

        interessados.adiciona(new Jogador("Bruno", "GTA"));
        interessados.adiciona((Notifica) new Cliente("Bruno", "CS"));

        interessados.notifica("CS");
    }
}