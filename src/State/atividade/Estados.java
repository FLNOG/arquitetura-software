package State.atividade;

public enum Estados {

    POSTADO(1),
    REVISAO(2),
    LEITURA(3),
    PUBLICADO(4);

    private int id;

    Estados(int id){
        this.id = id;
    }

    int getId(){
        return this.id;
    }

}