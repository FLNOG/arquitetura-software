package State;

// import State.atividade.Atividade;
import State.atividade2.Atividade;

public class Main {
    public static void main(String[] args) {

        /* ATIVIDADE 1
        Atividade a = new Atividade();
        a.postado();
        System.out.println("-----");
        a.postado();
        System.out.println("-----");
        a.revisado();
        System.out.println("-----");
        a.publicado();
        */

        Atividade a = new Atividade();

        a.postado();
        a.postado();
        a.publicado();
        a.revisado();
    }
}
