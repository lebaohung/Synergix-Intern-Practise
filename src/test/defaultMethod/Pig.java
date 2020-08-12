package test.defaultMethod;

public class Pig implements Mammal, Animal {
    @Override
    public void run() {
        System.out.println("Pig running");
    }

    @Override
    public void eat() {
        System.out.println("Pig eating");
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
        Mammal.super.sleep();
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.eat();
        pig.run();
        pig.sleep();
    }
}
