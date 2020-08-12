package test.interface2;

public class Dog implements Animal, Mammal {
    public void eat() {

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
