package test.defaultMethod;

public class Cat implements Mammal {
    @Override
    public void run() {
        System.out.println("Cat running");
    }

    @Override
    public void eat() {
        System.out.println("Cat running");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}
