package test.interface1;

public class Cat implements Animal{
    @Override
    public void swim() {

    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
