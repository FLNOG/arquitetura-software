package Facade;

public class FacadeUser {
    private Nome n;
    private Email e;
    private CPF c;

    public FacadeUser(){
        n = new Nome();
        e = new Email();
        c = new CPF();
    }

    public boolean validaCadastro(String nome, String email, String cpf){
        return (n.validaNome(nome)) && (e.validaEmail(email)) && (c.validaCPF(cpf));
    }
}