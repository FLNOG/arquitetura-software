package Observer;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class Gestor {
    ArrayList<Notifica> lista;

    public Gestor() {
        lista = new ArrayList<>();
    }

    public boolean adiciona(Notifica jogador){
        if (!lista.contains(jogador)) {
            lista.add(jogador);
            return true;
        }

        return false;
    }

    public boolean remove(Notifica jogador){
        if (lista.contains(jogador)) {
            lista.remove(jogador);
            return true;
        }
        return false;
    }

    public void notifica(String jogo){
        for (Notifica pessoa : lista){
            if (pessoa.getClass().getSimpleName().equals("Jogador")){
                if(((Jogador)pessoa).getJogo().equals(jogo)){
                    pessoa.aviso(jogo);
                }
            }
            if (pessoa.getClass().getSimpleName().equals("Cliente")){
                if (((Cliente)pessoa).getJogo().equals(jogo)){
                    pessoa.aviso(jogo);
                }
            }
        }
    }
}