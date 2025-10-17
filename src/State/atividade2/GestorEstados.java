package State.atividade2;

public class GestorEstados {
    
    private TipoEstados estado;
    
    public GestorEstados(TipoEstados inicio){
        this.estado = new Postagem();
    }
    
    public void postado(){
        this.estado = estado.postado();
    }
     
    public void revisado(){
        this.estado = estado.revisado();
    }
       
    public void lido(boolean aprovado){
        this.estado = estado.lido(aprovado);
    }
    
    public void publicado(){
        this.estado = estado.publicado();
    }
    
    public void avancar(boolean aprovado){
        if (this.estado.getClass().getSimpleName().equals("Aprovado")){
            this.estado = new Revisao();
        }
    }
}