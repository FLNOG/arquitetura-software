package State.atividade;

public class Atividade {

    private Estados estado;

    public Atividade(){
        this.estado = Estados.POSTADO;

    }

    public void mudaEstado(boolean aprovado){
        if (this.estado == Estados.POSTADO){
            System.out.println("Revisao");
            this.estado = Estados.REVISAO;
        } else if (this.estado == Estados.REVISAO){
            System.out.println("leitura");
            this.estado = Estados.LEITURA;
        } else if (this.estado == Estados.LEITURA && aprovado){
            System.out.println("publicado");
            this.estado = Estados.PUBLICADO;
        } else if (this.estado == Estados.LEITURA && !aprovado){
            System.out.println("revisao");
            this.estado = Estados.REVISAO;
        } else if (this.estado == Estados.PUBLICADO){
            System.out.println("postado");
            this.estado = Estados.POSTADO;
        }
    }

    public void mudaEstado(Estados e){
        int estado = e.getId();
        if (this.estado.getId() == 1 && estado == 2){
            System.out.println("Revisao");
            this.estado = Estados.REVISAO;
        } else if (this.estado.getId() == 2 && estado == 3){
            System.out.println("Leitura");
            this.estado = Estados.LEITURA;
        } else if (this.estado.getId() == 3 && estado == 4){
            System.out.println("Publicado");
            this.estado = Estados.PUBLICADO;
        } else if (this.estado.getId() == 3 && estado == 2){
            System.out.println("Revisao");
            this.estado = Estados.REVISAO;
        } else if (this.estado.getId() == 4 && estado == 1){
            System.out.println("Postado");
            this.estado = Estados.POSTADO;
        }
    }



    public void postado(){
        if (this.estado == Estados.POSTADO){
            System.out.println("Revisao");
            this.estado = Estados.REVISAO;
        }
    }

    public void revisado(){
        if (this.estado == Estados.REVISAO){
            System.out.println("leitura");
            this.estado = Estados.LEITURA;
        }
    }


    public void lido(boolean aprovado){
        if (this.estado == Estados.LEITURA && aprovado){
            System.out.println("publicado");
            this.estado = Estados.PUBLICADO;
        } else if (this.estado == Estados.LEITURA && !aprovado){
            System.out.println("revisao");
            this.estado = Estados.REVISAO;
        }
    }

    public void publicado(){
        if (this.estado == Estados.PUBLICADO){
            System.out.println("postado");
            this.estado = Estados.POSTADO;
        }
    }
}