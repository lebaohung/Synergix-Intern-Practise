package test.interface2;

public class Dog implements Animal, Mammal, Cloneable {

    private int age;

    public void eat() {

    }

    @Override
    public Integer setAge() {
        return 0;
    }

    static void pay(int... dog) {

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.age = Animal.age;
        System.out.println(dog.age);
        Object object;
        try {
            object = (Dog) dog.clone();
            System.out.println(object);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
