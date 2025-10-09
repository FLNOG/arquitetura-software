package Prototype;

public class ConcretePrototype implements Prototype {
    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.data);
    }
}