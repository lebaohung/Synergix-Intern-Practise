package test.interface1;

public class Dog implements Animal, Mamal {


    @Override
    public void swim() {

    }

    @Override
    public void eat() {
        System.out.println("Dog eatting");
    }


    @Override
    public void run() {
        System.out.println("Dog running");

    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        dog.sleep();
    }
}
