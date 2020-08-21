package test.interface2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cat {

    static Dog dog = new Dog("James");

    public static void changDogName(Dog dog) {
        dog = new Dog("Tommy");
    }

    public static void main(String[] args) {
        System.out.println(dog.getName());
        Cat.changDogName(dog);
        System.out.println(dog.getName());
    }
}
