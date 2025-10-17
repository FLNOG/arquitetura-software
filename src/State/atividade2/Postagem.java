package State.atividade2;

public class Postagem implements TipoEstados{

    @Override
    public TipoEstados postado() {
        System.out.println("Postado");
        return new Revisao();
    }

    @Override
    public TipoEstados revisado() {
        System.out.println("Atividade em Postado");
        return this;
    }

    @Override
    public TipoEstados lido(boolean aprovado) {
        System.out.println("Atividade em Postado");
        return this;
    }

    @Override
    public TipoEstados publicado() {
        System.out.println("Atividade em Postado");
        return this;    
    }
}