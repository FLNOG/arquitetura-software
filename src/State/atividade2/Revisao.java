package State.atividade2;

public class Revisao implements TipoEstados{

    @Override
    public TipoEstados postado() {
        System.out.println("Em revisao");
        return this;
    }

    @Override
    public TipoEstados revisado() {
        System.out.println("Passa para leitura");
        return new Leitura();
    }

    @Override
    public TipoEstados lido(boolean aprovado) {
        System.out.println("Em revisao");
        return this;
    }

    @Override
    public TipoEstados publicado() {
        System.out.println("Em revisao");
        return this;
    }
}