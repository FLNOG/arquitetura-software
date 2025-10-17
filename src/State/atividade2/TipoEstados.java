package State.atividade2;

public interface TipoEstados {
    public TipoEstados postado();
    public TipoEstados revisado();
    public TipoEstados lido(boolean aprovado);
    public TipoEstados publicado();
    
}