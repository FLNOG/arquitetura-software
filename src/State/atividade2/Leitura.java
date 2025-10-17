package State.atividade2;

public class Leitura implements TipoEstados{

    @Override
    public TipoEstados postado() {
        System.out.println("Em leitura");
        return this;
    
    }

    @Override
    public TipoEstados revisado() {
        System.out.println("Em revisao");
        return this;
    
    }

    @Override
    public TipoEstados lido(boolean aprovado) {
        if (aprovado){
            System.out.println("Para publicação");
            return new Publicacao();
        } else {
            System.out.println("Volta pra revisao");
            return new Revisao();
        }
    }

    @Override
    public TipoEstados publicado() {
        System.out.println("Em revisao");
        return this;
    }
}