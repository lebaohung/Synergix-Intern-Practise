package test.defaultMethod;

public class Dog implements ZAnimal {
    @Override
    public void run() {
        System.out.println("Dog running");
    }

    @Override
    public void eat() {
        System.out.println("Dog eatting");
    }

       public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
