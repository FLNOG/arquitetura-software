package Prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Exemplo");
        Prototype clone = prototype.clone();
        System.out.println("Original: " + prototype);
        System.out.println("Cloned: " + clone);
    }
}