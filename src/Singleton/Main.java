package Singleton;

public class Main {
    public static void main(String[] args) {
        double valor = 10;
        SingletonInstance instance = SingletonInstance.getInstance(valor);
        SingletonInstance instance2 = SingletonInstance.getInstance(++valor);
        System.out.println(instance + " " + instance.getValor());
        System.out.println(instance2 + " " + instance2.getValor());

    }
}
