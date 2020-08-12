package test.interface2;

import test.interface1.Animal;

public class Cat implements Animal {
    @Override
    public void swim() {

    }

    @Override
    public void eat() {
        System.out.println("Cat eating...");
    }

    @Override
    public void run() {
        System.out.println("Cat running");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }



    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.run();
    }
}
