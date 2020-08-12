package test.defaultMethod;

public interface Mammal extends ZAnimal {

    void eat();
    default void sleep() {
        System.out.println("Mammal sleeping");
    }
}
