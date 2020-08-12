package test.defaultMethod;

public interface Mammal  {

    void eat();
    default void sleep() {
        System.out.println("Mammal sleeping");
    }
}
