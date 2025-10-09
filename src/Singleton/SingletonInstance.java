package Singleton;

public class SingletonInstance {
    private static SingletonInstance instance;
    private double valor;

    private SingletonInstance(double valor){
        this.valor = valor;
    }

    public static SingletonInstance getInstance(double valor){
        if(instance == null){
            instance = new SingletonInstance(valor);
        }
        return instance;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}