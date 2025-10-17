package State.atividade2;

public class Publicacao implements TipoEstados{

    @Override
    public TipoEstados postado() {
        System.out.println("Em publicacao");
        return this;
    }

    @Override
    public TipoEstados revisado() {
        System.out.println("Em publicacao");
        return this;
    }

    @Override
    public TipoEstados lido(boolean aprovado) {
        System.out.println("Em publicacao");
        return this;
    }

    @Override
    public TipoEstados publicado() {
        System.out.println("Em postagem");
        return new Postagem();
    }
}