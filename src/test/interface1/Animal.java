package test.interface1;

public interface Animal extends Life{
    static String sing() {
        return null;
    }

    default void swim() {
        return;
    }
    void eat();
    void run();
    void sleep();
}
