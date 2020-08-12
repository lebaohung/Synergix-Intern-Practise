package test.defaultMethod;

public interface ZAnimal {
    void run();
    default void eat() {
        System.out.println("Animal eating");
    };

    default void sleep() {
        System.out.println("Animal sleeping");
    }
}
