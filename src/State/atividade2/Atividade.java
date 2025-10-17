package State.atividade2;

public class Atividade {
    
    private GestorEstados gestor;
    
    public Atividade(){
        this.gestor = new GestorEstados(new Postagem());
    }
    
    public void postado(){
        gestor.postado();
    }
    
     
    public void revisado(){
        gestor.revisado();
    }
       
    public void lido(boolean aprovado){
        gestor.lido(aprovado);
    }
    
    public void publicado(){
        gestor.publicado();
    }
}